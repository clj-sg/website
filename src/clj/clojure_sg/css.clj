(ns clogure-sg.css 
  (:require [garden.core :as g]
           [garden.units :as u]
           [garden.selectors :as s]
           [garden.stylesheet :as st]))

;;HTML component
(defn html 
  []
  (g/css [:html {:height (u/percent 100)}]))

;; *
(defn star
  []  
  (g/css [:* {:margin 0 :padding 0}]))

;;body
(defn body 
  [] 
  (g/css [:body {:font " normal .80em 'trebuchet ms', arial, sans-serif" 
                 :background "#FFF" 
                 :color "#FFF"}]))
;;p
(defn p 
  [] 
  (g/css [:p {:padding "0 0 20px 0" 
              :line-height (u/em 1.7)}]))

;;img
(defn img
  []
  (g/css [:img {:border 0}])

(defn h1-h2-h3-h4-h5-h6
  []
  (g/css [:h1 :h2 :h3 :h4 :h5 :h6 {:color "#362C20" 
                                   :letter-spacing (u/em 0)
                                   :padding "0 0 5px 0"}]))

(defn h1-h2-h3
  []
  (g/css [:h1 :h2 :h3 {:font "normal 170% 'century gothic', arial"
                       :margin "0 0 15px 0"
                       :padding "15px 0 5px 0"
                       :color "#000"}]))

(defn h2
  []
  (g/css [:h2 {:font-size (u/percent 160) 
               :padding "9px 0 5px 0" 
               :color "#009FBC"}]))


(defn h3
  []
  (g/css [:h3 {:font-size (u/percent 160)
               :padding "9px 0 5px 0"}]))


(defn h4-h6
  []
  (g/css [:h4 :h6 {:color "#009FBC" :padding "0 0 5px 0" :font "normal 110% arial" :text-transform "uppercase"}]))

(defn h5-h6
    []
      (g/css [:h5 :h6 {:color "#888" :font "normal 95% arial" :letter-spacing "normal" :padding "0 0 15px 0"}]))

(defn  a-a-hover
  []
  (g/css [:a :a:hover {:outline "none" 
                       :text-declaration "underline"
                       :color "#00C6F0"}]))

(defn  a-a-hover
    []
      (g/css [:a:hover {text-declaration "none"}]))


;blockquote
;{ margin: 20px 0;
;   padding: 10px 20px 0 20px;
;     border: 1px solid #E5E5DB;
;       background: #FFF;}


(defn blockquote
  []
  (g/css [:blockquote {:margin "20px 0" 
                       :padding "10px 20px 0 20px" 
                       :border "1px solid #ESE5DB"}]))

(defn ul
  []
  (g/css [:ul {:margin  "2px 0 22px 17px"}]))

(defn ul-li
  []
  (g/css [:ul :li {:list-tyle-type "circle" 
                   :padding "0 0 4px 5px" 
                   :margin "0 0 6px 0" 
                   :line-height (u/em 1.5) }]))

(defn ol
  []
  (g/css [:ol {:margin "8px 0 22px 20px"}]))

(defn ol-li
  []
  (g/css [:ol :li {:margin "0 0 11px 0"}]))

(defn left)
  []
  (g/css [:left {:float "left"
                 :width "auto"
                 :margin-right (u/px 10)}]))

(defn right)
  []
  (g/css [:right {:float "left"
                 :width "auto"
                 :margin-right (u/px 10)}]))

(defn center
  []
  (g/css [:center {:display "block"
                   :text-align "center"
                  :margin "20px auto"}]))

(defn main-logo-menubar-site_content-footer
  []
  (g/css [:#main :#logo :#menubar :#site_content :#footer {:margin-left "auto"
                                                           :margin-right "auto"}]))
(defn hash-header
  []
  (g/css [:#header {:background "#CCC" 
                   :height (u/px 186) 
                   :border-bottom "1px solid #CCC"}]))
(defn hash-banner
  []
  (g/css [:#banner {:background "transparent url(banner.jpg) no-repeat" 
                    :width (u/px 860)
                    :height (u/px 180)
                    :margin-bottom (u/px 20)
                    :border "10px solid #DDD"}]))

(defn hash-logo-logo_text
  []
  (g/css [:#logo :#logo_text {:position "absolute"
                              :top (u/px 10)
                              :left 0}]))
(defn hash-h1-h2
  []
  (g/css [:#logo [:h1 :h2] {:font "normal 300% 'century gothic', arial, sans-serif"
                                    :border-bottom 0
                                    :test-transform "none"
                                    :margin "0 0 0 9px"}]))


#logo_text h1 a .logo_colour
{ color: #00C6F0;}

(defn hash-logo-a-text-colour
  []
  (g/css [:#logo_text [:h1 [:a [:.logo_color {:color "#00C6F0"}]]]))

#logo_text a:hover .logo_colour
 { color: #DDD;}

(defn hash-log_text-a-hover-logo_colour
  []
  (g/css [:#logo_text [:a:hover [:.logo_colour {:color "#DDD"}]]]))







