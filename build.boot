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
