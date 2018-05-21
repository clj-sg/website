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

(defn  a-hover
    []
      (g/css [:a:hover {:text-declaration "none"}]))

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

(defn right
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

(defn hash-logo
  []
  (g/css [:#logo {:width (u/px 880) 
                  :position "relative"
                  height: (u/px 140)
                  background: "#F5F5F5"}]))


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



(defn hash-logo-a-text-colour
  []
  (g/css [:#logo_text [:h1 [:a [:.logo_color {:color "#00C6F0"}]]]]))

#logo_text a:hover .logo_colour
 { color: #DDD;}

(defn hash-log_text-a-hover-logo_colour
  []
  (g/css [:#logo_text [:a:hover [:.logo_colour {:color "#DDD"}]]]))


(defn  hash-logo-text-h1-a-hover
  []
  (g/css [:#logo_text [:h1 [:a :a:hover {:padding "22px 0 0 0" 
                                         :color "#323232"
                                         :letter-spacing (u/em 0.1)
                                         :text-decoration "none"}]]]))


;;#logo_text h2
;;{ font-size: 120%;
;;   padding: 4px 0 0 0;
;;     color: #999;}

(defn hash-logo-text
  []
  (g/css [:#logo_text [:h2 {:font-size {u/percent 120}
                            :padding "4px 0 0 0"
                            :color: "#999"}]]))

;;#menubar
;;{ width: 872px;
;;        height: 45px;
;;          padding-right: 8px;
;;            background: #DDD;
;;              border-top: 1px solid #CCC;}

(defn hash-menubar
  []
  (g/css [:#menubar {:width (u/px 872)
                     :padding-right (u/px 45)
                     :background "#DDD"
                     :border-top "1px solid #CCC"}]))

;;ul#menu
;;{ float: right;
;;   margin: 0;}
(defn ul-hash-menu
  []
  (g/css [:ul#menu {:float "right"
                    :margin 0}]))

;;   ul#menu li
;;   { float: left;
;;      padding: 0 0 0 9px;
;;        list-style: none;
;;          margin: 8px 4px 0 4px;}
(defn ul-hash-menu-li
  []
  (g/css [:ul#menu [:li {:float "left"
                         :padding "0 0 0 9px"
                         :list-style "none"
                         :margin "8px 4px 0 4px"}]]))

;;ul#menu li a
;;{ font: normal 100% 'trebuchet ms', sans-serif;
;;  display: block;
;;  float: left;
;;   height: 20px;
;;  padding: 6px 20px 5px 20px;
;;  text-align: center;
;;  color: #FFF;
;;  text-decoration: none;
;;  background: #BBB;}

(defn ul-hash-menu-li-a
  []
  (g/css [:ul#menu [:li [:a {:font "normal 100% 'trebuchet ms', sans-serif"
                             :display "block"
                             :float "left"
                             :height (u/px 20)
                             :padding "6px 20px 5px 20px"
                             :text-align "center"
                             :color "#FFF"
                             :text-decoration "none"
                             :background "#BBB"}]]]))

;;ul#menu li.selected a
;; { height: 20px;
;;   padding: 6px 20px 5px 11px;}

(defn ul-hash-menu-li-selected-a
  []
  (g/css [:ul#menu [:li.selected [:a {:height (u/px 20)
                                      :padding "6px 20px 5px 11px"}]]]))

  
;;ul#menu li.selected
;;{ margin: 8px 4px 0 13px;
;;  background: #00C6F0;}

(defn ul-hash-menu-li-selected
  []
  (g/css [:ul#menu [:li.selected {:margin "8px 4px 0 13px"
                                  :background "#00C6F0"}]]))


;;ul#menu li.selected a, ul#menu li.selected a:hover
;;{ background: #00C6F0;
;;  color: #FFF;}
(defn ul-menu-li-selected-a-hover
  []
  (g/css [:ul#menu [:li.selected [:a :a:hover {:background "00C6F0"
                                               :color "#FFF"}]]]))

;;ul#menu li a:hover
;;  { color: #323232;}
(defn ul-menu-li-a-hover
  []
  (g/css [:ul#menu [:li :a:hover {:color "#323232"}]]))

;;#site_content
;;{ width: 880px;
;;overflow: hidden;
;;margin: 20px auto 0 auto;
;;padding: 0 0 10px 0;}

(defn hash-site-content
  []
  (g/css [:#site_content {:width (u/px 880)
                          :overflow "hidden"
                          :margin "20px auto 0 auto"
                          padding "0 0 10px 0"}]))

;;#sidebar_container
;;{ float: left;
;;   width: 224px;}
(defn hash-sidebar-container
  []
  (g/css [:#sidebar_container {:float "left"
                               :width (u/px 224)}]))

;;   .sidebar_top
;;   { width: 222px;
;;      height: 14px;
;;        background: transparent url(side_top.png) no-repeat;}
(defn sidebar-top
  []
  (g/css [:sidebar_top {:width (u/px 224)
                        :height (u/px 14)
                        :background "transparent url(side_top.png) no-repeat"}]))

;;        .sidebar_base
;;        { width: 222px;
;;           height: 14px;
;;             background: url(side_base.png) no-repeat;}

(defn sidebar-base
    []
      (g/css [:sidebar_base {:width (u/px 224)
                             :height (u/px 14)
                             :background "transparent url(side_bar.png) no-repeat"}]))

;;.sidebar
;;{ float: right;
;;  width: 222px;
;;  padding: 0;
;;  margin: 0 0 16px 0;}

(defn sidebar
  []
  (g/css {:float "right"
          :width (u/px 222)
          :padding 0
          :margin "0 0 16px 0"}))

;;  .sidebar_item
;; { background: url(side_back.png) repeat-y;
;;          padding: 0 15px;
;;            width: 192px;}

(defn sidebar-item
  []
  (g/css [:.siderbar_item {:background "url(side_back.png) repeat-y"
                           :padding "0 15px"
                           :width (u/px 192)}]))

;;            .sidebar li a.selected
;;            { color: #444;}
(defn sidebar-li-a-selected
  []
  (g/css [:sidebar [:li :a.selected {:color "#444"}]]))


;;             .sidebar ul
;;             { margin: 0;}

(defn sidebar-ul
  []
  (g/css [:sidebar [:ul {:margin 0}]]))

;;              #content
;;              { text-align: left;
;;                 width: 620px;
;;                   padding: 0 0 0 5px;
;;                     float: right;}

(defn content
  []
  (g/css [:content {:text-align "left"
                    :width (u/px 620)
                    :padding "0 0 0 5px"
                    :float "right"}]))

;;                     #content ul
;;                     { margin: 2px 0 22px 0px;}
(defn hash-content-ul
  []
  (g/css [:hash-content-ul {:margin "2px 0 22px 0px"}]))

;;                      #content ul li, .sidebar ul li
;;                      { list-style-type: none;
;;                         background: url(bullet.png) no-repeat;
;;                           margin: 0 0 0 0;
;;                             padding: 0 0 4px 25px;
;;                               line-height: 1.5em;}


(defn hash-content-ul-li-sidebar-ul-li
  []
  (g/css [:#content :#sidebar [:ul [:li {:list-style-type "none"
                                         :background "url(bullet.png) no-repeat"
                                         :margin "0 0 0 0"
                                         :padding "0 0 4px 25px"
                                         :line-height (u/em 1.5)}]]]))


;;#footer
;;{ width: 100%;
;;   font-family: 'trebuchet ms', sans-serif;
;;     font-size: 100%;
;;       height: 80px;
;;         padding: 28px 0 5px 0;
;;           text-align: center;
;;             background: #CCC;
;;               border-top: 1px solid #AAA;
;;                 color: #FFF;}
(defn hash-footer
  []
  (g/css [:#footer {:width (u/percent 100)
                    :font-family "'trebuchet ms', sans-serif"
                    :font-size (u/percent 100)
                    :height (u/px 80)
                    :padding "28px 0 5px 0"
                    :text-align "center"
                    :background "#CCC"
                    :border-top "1px solid #AAA"
                    :color "#FFF"}]))
(defn hash-footer-p
  []
  (g/css [:#footer [:p {:line-height (u/em 1.7)
                        :padding "0 0 10px 0" }]]))


;;                 #footer p
;;                 { line-height: 1.7em;
;;                    padding: 0 0 10px 0;}


;;                    #footer a
;;                    { color: #FFF;
;;                       text-decoration: none;}

(defn  hash-footer-a
  []
  (g/css [:#footer [:a {:color "#FFF"
                        text-decoration: "none"}]]))

;;#footer a:hover
;;{ color: #00C6F0;
;;text-decoration: none;}

(defn hash-footer-a-hover
  []
  (g/css [:#footer [:a:hover {:color "#00C6F0"
                              :text-declaration "none"}]]))

;;.search
;;{ color: #5D5D5D;
;;    border: 1px solid #BBB;
;;    width: 134px;
;;padding: 4px;
;;font: 100% arial, sans-serif;}

(defn dot-search
  []
  (g/css [:.search  {:color "#5D5D5D"
                     :border "1px solid #BBB"
                     :width (u/px 134)
                     :padding (u/px 4)
                     :font "100% arial, sans-seri"}]))

;;.form_settings
;;{ margin: 15px 0 0 0;}
(defn dot-form-settings
  []
  (g/css [:.form_settings {:margin "15px 0 0 0"}]))

;;.form_settings p
;;{ padding: 0 0 4px 0;}
(defn dot-from-settings-p
  []
  (g/css [:.form_settings {:padding "0 0 4px 0"}]))

;;.form_settings span
;;{ float: left;
;;width: 200px;
;;text-align: left;}

(defn form-settings-span
  []
  (g/css [:.form_settings [:span {:float "left"
                                  :width (u/px 200)
                                  :text-align "left"}]]))

;;form_settings input, .form_settings textarea
;;{ padding: 5px;
;;width: 299px;
;;font: 100% arial;
;;border: 1px solid #E5E5DB;
;;background: #FFF;
;;color: #47433F;}

(defn form-settings-input-textarea
  []
  (g/css [:form_settings [:input :textarea {:padding (u/px 5)
                                            :width (u/px 299)
                                            :font "100% arial"
                                            :border "1px solid #E5E5D8"
                                            :background "#FFF"
                                            :color "#47433F"}]]))

;;.form_settings .submit
;;{ font: 100% arial;
;;   border: 0;
;;     width: 99px;
;;       margin: 0 0 0 212px;
;;         height: 33px;
;;           padding: 2px 0 3px 0;
;;             cursor: pointer;
;;               background: #3B3B3B;
;;                 color: #FFF;}
(defn dot-form-settings-dot-submit
  []
  (g/css [:.form_settings [:.submit {:border 0
                                     :width (u/px 99)
                                     :margin "0 0 0 212px"
                                     :height (u/px 33)
                                     :padding "2px 0 3px 0"
                                     :cursor "pointer"
                                     :background "#3B3B3B"
                                     :color "#FFF"}]]))

;;                 .form_settings textarea, .form_settings select
;;                 { font: 100% arial;
;;                    width: 299px;}

(defn dot-form-settings-textarea-select
  []
  (g/css [:.form_settings [:textarea :select {:font "100% arial"
                                              :width (u/px 299)}]]))

;;                    .form_settings select
;;                    { width: 310px;}
(defn dot-form-settings-select
  []
  (g/css [:.form_settings [:select {:width (u/px 310)}]]))

;;   .form_settings .checkbox
;;   { margin: 4px 0;
;;     padding: 0;
;;     width: 14px;
;;     border: 0;
;;     background: none;}
(defn  dot-form-settings-checkbox
  []
  (g/css [:.form_settings [:.checkbox {:margin "4px 0"
                                       :padding "0"
                                       :width (u/px 14)
                                       :border 0
                                       :background "none"}]]))

#    .separator
#    { width: 100%;
#      height: 0;
#      border-top: 1px solid #D9D5CF;
#      border-bottom: 1px solid #FFF;
#      margin: 0 0 20px 0;}

(defn separator
      []
      (g/css [:.separator {:width (u/px 100)
                           :height 0
                           :border-top "1px slid #D9D5CF"
                           :border-bottom "1px solid #FFF"
                           :margin "0 0 20px 0"}]))

;;   table
;;  { margin: 10px 0 30px 0;}
(defn table
      []
      (g/css [:table {:margin "10px 0 30px 0"}]))

;;  table tr th, table tr td
;; { background: #3B3B3B;
;;color: #FFF;
;;padding: 7px 4px;
;;text-align: left;}
(defn table-tr-th-td
      []
      (g/css [:table [:tr [:th :td {:background "#3B3B3B"
                                    :color "#FFF"
                                    :padding "7px 4px"
                                    :text-align "left"}]]]))

;;table tr td
;;{  background: #E5E5DB;
;;   color: #47433F;
;;   border-top: 1px solid #FFF;}
(defn table-tr-td
      []
      (g/css [:table [:tr [:td {:background "#E5E5D8"
                                :color "#47433F"
                                :border-top "1px solid #FFF"}]]]))

(defn main-css
      []
      (g/css (html)
             (star)
             (body)
             (p)
             (img)
             (h1-h2-h3-h4-h5-h6)
             (h1-h2-h3)
             (h2)
             (h3)
             (h4-h6)
             (h5-h6)
             (a-a-hover)
             (a-hover)
             (blockquote)
             (ul)
             (ul-li)
             (ol)
             (ol-li)
             (left)
             (right)
             (center)
             (main-logo-menubar-site_content-footer)
             (hash-header)
             (hash-banner)
             (hash-logo)
             (hash-logo-logo_text)
             (hash-h1-h2)
             (hash-logo-a-text-colour)
             (hash-log_text-a-hover-logo_colour)
             (hash-logo-text-h1-a-hover)
             (hash-logo-text)
             (hash-menubar)
             (ul-hash-menu)
             (ul-hash-menu-li)
             (ul-hash-menu-li-a)
             (ul-hash-menu-li-selected-a)
             (ul-hash-menu-li-selected)
             (ul-menu-li-selected-a-hover)
             (ul-menu-li-a-hover)
             (hash-site-content)
             (hash-sidebar-container)
             (sidebar-top)
             (sidebar-base)
             (sidebar)
             (sidebar-item)
             (sidebar-li-a-selected)
             (sidebar-ul)
             (content)
             (hash-content-ul)
             (hash-content-ul-li-sidebar-ul-li)
             (hash-footer)
             (hash-footer-p)
             (hash-footer-a)
             (hash-footer-a-hover)
             (dot-search)
             (dot-form-settings)
             (dot-from-settings-p)
             (form-settings-span)
             (form-settings-input-textarea)
             (dot-form-settings-dot-submit)
             (dot-form-settings-textarea-select)
             (dot-form-settings-select)
             (dot-form-settings-checkbox)
             (separator)
             (table)
             (table-tr-th-td)
             (table-tr-td)))
