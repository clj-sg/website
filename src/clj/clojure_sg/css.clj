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

;;img

;;h1

;;h2

