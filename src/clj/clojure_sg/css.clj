(ns clojure-sg.css
    (:require [garden.core :as g]
              [garden.units :as u]
              [garden.selectors :as s]
              [garden.stylesheet :as st]
              [garden.def :as dfn]))

;;HTML component
(dfn/defstyles html
    [:html {:height (u/percent 100)
            :display "grid"}])

;; *
(dfn/defstyles star
    [:* {:margin 0 :padding 0}])

;;body
(dfn/defstyles body
    [:body {:font " normal .80em 'trebuchet ms', arial, sans-serif"
            :background "#FFF"
            :color "#FFF"
            :height (u/percent 100)
            :display "grid"}])
;;p
(dfn/defstyles p
    [:p {:padding "0 0 20px 0"
                       :line-height (u/em 1.7)}])

;;img
(dfn/defstyles img
    [:a {:margin "auto"}])

(dfn/defstyles h1-h2-h3-h4-h5-h6
    [:h1 :h2 :h3 :h4 :h5 :h6 {:color "#362C20"
                              :letter-spacing (u/em 0)
                              :padding "0 0 5px 0"}])

(dfn/defstyles h1-h2-h3
    [:h1 :h2 :h3 {:font "normal 170% 'century gothic', arial"
                  :margin "0 0 15px 0"
                  :padding "15px 0 5px 0"
                  :color "#000"}])

(dfn/defstyles h2
    [:h2 {:font-size (u/percent 160)
          :padding "9px 0 5px 0"
          :color "#009FBC"}])


(dfn/defstyles h3
    [:h3 {:font-size (u/percent 160)
          :padding "9px 0 5px 0"}])


(dfn/defstyles h4-h6
    [:h4 :h6 {:color "#009FBC" :padding "0 0 5px 0" :font "normal 110% arial" :text-transform "uppercase"}])

(dfn/defstyles h5-h6
      [:h5 :h6 {:color "#888" :font "normal 95% arial" :letter-spacing "normal" :padding "0 0 15px 0"}])


(dfn/defstyles center
  [:.center {:display "table-cell"
             :text-align "center"
             :vertical-align "middle"}])


(dfn/defstyles wrapper
  [:#wrapper {:height "100%"
               :width "100%"
               :margin 0
               :padding 0
               :border 0}])

(dfn/defstyles wrapper-td
  [:#wrapper [:td {:vertical-align "middle"
                   :text-align "center"}]])



(dfn/defstyles demo
  [:#demo {:background "url(images/clj-sg-logo-500px.png) no-repeat center center"
           :height "200px"
           :width "200px"}])


(dfn/defstyles main-css
      html
      star
      body
      p
      img
      h1-h2-h3-h4-h5-h6
      h1-h2-h3
      h2
      h3
      h4-h6
      h5-h6
      center
      wrapper
      wrapper-td
      demo)
