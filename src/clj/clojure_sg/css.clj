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



