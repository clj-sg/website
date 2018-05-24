(set-env!
    :exclusions '[org.clojure/clojure]
    :dependencies (into '[[seancorfield/boot-tools-deps "0.4.5" :scope "test"]]))


(require '[boot-tools-deps.core :refer [deps load-deps]])

(task-options! pom (clojure.edn/read-string (slurp (clojure.java.io/file "project.edn"))))

(deftask build
  "Build and install the project locally."
   []
   (comp (deps :overwrite-boot-deps true) (pom) (jar) (install)))

(deftask test
  "Placeholder for future test task."
  []
  identity)


(deftask dev
  "Launch immediate feedback dev environment"
  []
  (load-deps {:overwrite-boot-deps true})
  (require  'pandeiro.boot-http)
  (require 'adzerk.boot-cljs)
  (require 'adzerk.boot-reload)
  (require 'adzerk.boot-cljs-repl)
  (require 'org.martinklepsch.boot-garden)
  (require 'adzerk.boot-reload)
  (let [cljs-repl (resolve 'adzerk.boot-cljs-repl/cljs-repl)
        serve (resolve 'pandeiro.boot-http/serve)
        cljs (resolve 'adzerk.boot-cljs/cljs)
        start-repl (resolve 'adzerk.boot-cljs-repl/start-repl)
        garden (resolve 'org.martinklepsch.boot-garden/garden)
	reload (resolve 'adzerk.boot-reload/reload)]
    (comp
    (garden :styles-var 'clojure-sg.css/main-css
            :output-to "css/main.css"
            :pretty-print true)
   (serve :handler 'clojure-sg.core/handler ;; add ring handler
          :resource-root "target"            ;; add resource-path
          :reload true)                      ;; reload server side ns
   (watch)
   (reload)
   (cljs-repl) ;; before cljs
   (cljs)
   (target :dir #{"target"}))));
