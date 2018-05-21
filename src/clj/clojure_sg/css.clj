(ns clojure-sg.css 
  (:require [garden.core :as g]
           [garden.units :as u]
           [garden.selectors :as s]
           [garden.stylesheet :as st]
           [garden.def :as dfn]))

;;HTML component
(dfn/defstyles html 
  [:html {:height (u/percent 100)}])

;; *
(dfn/defstyles star
  [:* {:margin 0 :padding 0}])

;;body
(dfn/defstyles body 
  [:body {:font " normal .80em 'trebuchet ms', arial, sans-serif" 
                 :background "#FFF" 
                 :color "#FFF"}])
;;p
(dfn/defstyles p
  [:p {:padding "0 0 20px 0" 
              :line-height (u/em 1.7)}])

;;img
(dfn/defstyles img
  [:img {:border 0}])

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

(dfn/defstyles  a-a-hover
  [:a :a:hover {:outline "none" 
                       :text-declaration "underline"
                       :color "#00C6F0"}])

(dfn/defstyles  a-hover
    [:a:hover {:text-declaration "none"}])

(dfn/defstyles blockquote
  [:blockquote {:margin "20px 0" 
                       :padding "10px 20px 0 20px" 
                       :border "1px solid #ESE5DB"}])

(dfn/defstyles ul
  [:ul {:margin  "2px 0 22px 17px"}])

(dfn/defstyles ul-li
  [:ul :li {:list-tyle-type "circle" 
                   :padding "0 0 4px 5px" 
                   :margin "0 0 6px 0" 
                   :line-height (u/em 1.5) }])

(dfn/defstyles ol
  [:ol {:margin "8px 0 22px 20px"}])

(dfn/defstyles ol-li
  [:ol :li {:margin "0 0 11px 0"}])

(dfn/defstyles left)
  [:left {:float "left"
                 :width "auto"
                 :margin-right (u/px 10)}]

(dfn/defstyles right
  [:right {:float "left"
                 :width "auto"
                 :margin-right (u/px 10)}])

(dfn/defstyles center
  [:center {:display "block"
                   :text-align "center"
                  :margin "20px auto"}])

(dfn/defstyles main-logo-menubar-site_content-footer
  [:#main :#logo :#menubar :#site_content :#footer {:margin-left "auto"
                                                           :margin-right "auto"}])
(dfn/defstyles hash-header
  [:#header {:background "#CCC" 
                   :height (u/px 186) 
                   :border-bottom "1px solid #CCC"}])

(dfn/defstyles hash-banner
  [:#banner {:background "transparent url(banner.jpg) no-repeat" 
                    :width (u/px 860)
                    :height (u/px 180)
                    :margin-bottom (u/px 20)
                    :border "10px solid #DDD"}])

(dfn/defstyles hash-logo
  [:#logo {:width (u/px 880) 
           :position "relative"
           :height (u/px 140)
           :background "#F5F5F5"}])


(dfn/defstyles hash-logo-logo_text
  [:#logo :#logo_text {:position "absolute"
                              :top (u/px 10)
                              :left 0}])
(dfn/defstyles hash-h1-h2
  [:#logo [:h1 :h2] {:font "normal 300% 'century gothic', arial, sans-serif"
                                    :border-bottom 0
                                    :test-transform "none"
                                    :margin "0 0 0 9px"}])



(dfn/defstyles hash-logo-a-text-colour
  [:#logo_text [:h1 [:a [:.logo_color {:color "#00C6F0"}]]]])

(dfn/defstyles hash-log_text-a-hover-logo_colour
  [:#logo_text [:a:hover [:.logo_colour {:color "#DDD"}]]])


(dfn/defstyles  hash-logo-text-h1-a-hover
  [:#logo_text [:h1 [:a :a:hover {:padding "22px 0 0 0" 
                                         :color "#323232"
                                         :letter-spacing (u/em 0.1)
                                         :text-decoration "none"}]]])


;;#logo_text h2
;;{ font-size: 120%;
;;   padding: 4px 0 0 0;
;;     color: #999;}

(dfn/defstyles hash-logo-text
  [:#logo_text [:h2 {:font-size {u/percent 120}
                            :padding "4px 0 0 0"
                            :color "#999"}]])

;;#menubar
;;{ width: 872px;
;;        height: 45px;
;;          padding-right: 8px;
;;            background: #DDD;
;;              border-top: 1px solid #CCC;}

(dfn/defstyles hash-menubar
  [:#menubar {:width (u/px 872)
                     :padding-right (u/px 45)
                     :background "#DDD"
                     :border-top "1px solid #CCC"}])

;;ul#menu
;;{ float: right;
;;   margin: 0;}
(dfn/defstyles ul-hash-menu
  [:ul#menu {:float "right"
                    :margin 0}])

;;   ul#menu li
;;   { float: left;
;;      padding: 0 0 0 9px;
;;        list-style: none;
;;          margin: 8px 4px 0 4px;}
(dfn/defstyles ul-hash-menu-li
  [:ul#menu [:li {:float "left"
                         :padding "0 0 0 9px"
                         :list-style "none"
                         :margin "8px 4px 0 4px"}]])

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

(dfn/defstyles ul-hash-menu-li-a
  [:ul#menu [:li [:a {:font "normal 100% 'trebuchet ms', sans-serif"
                             :display "block"
                             :float "left"
                             :height (u/px 20)
                             :padding "6px 20px 5px 20px"
                             :text-align "center"
                             :color "#FFF"
                             :text-decoration "none"
                             :background "#BBB"}]]])

;;ul#menu li.selected a
;; { height: 20px;
;;   padding: 6px 20px 5px 11px;}

(dfn/defstyles ul-hash-menu-li-selected-a
  [:ul#menu [:li.selected [:a {:height (u/px 20)
                                      :padding "6px 20px 5px 11px"}]]])

  
;;ul#menu li.selected
;;{ margin: 8px 4px 0 13px;
;;  background: #00C6F0;}

(dfn/defstyles ul-hash-menu-li-selected
  [:ul#menu [:li.selected {:margin "8px 4px 0 13px"
                                  :background "#00C6F0"}]])


;;ul#menu li.selected a, ul#menu li.selected a:hover
;;{ background: #00C6F0;
;;  color: #FFF;}
(dfn/defstyles ul-menu-li-selected-a-hover
  [:ul#menu [:li.selected [:a :a:hover {:background "00C6F0"
                                               :color "#FFF"}]]])

;;ul#menu li a:hover
;;  { color: #323232;}
(dfn/defstyles ul-menu-li-a-hover
  [:ul#menu [:li :a:hover {:color "#323232"}]])

;;#site_content
;;{ width: 880px;
;;overflow: hidden;
;;margin: 20px auto 0 auto;
;;padding: 0 0 10px 0;}

(dfn/defstyles hash-site-content
  [:#site_content {:width (u/px 880)
                          :overflow "hidden"
                          :margin "20px auto 0 auto"
                          :padding "0 0 10px 0"}])
;;#sidebar_container
;;{ float: left;
;;   width: 224px;}
(dfn/defstyles hash-sidebar-container
  [:#sidebar_container {:float "left"
                               :width (u/px 224)}])

;;   .sidebar_top
;;   { width: 222px;
;;      height: 14px;
;;        background: transparent url(side_top.png) no-repeat;}
(dfn/defstyles sidebar-top
  [:sidebar_top {:width (u/px 224)
                        :height (u/px 14)
                        :background "transparent url(side_top.png) no-repeat"}])

;;        .sidebar_base
;;        { width: 222px;
;;           height: 14px;
;;             background: url(side_base.png) no-repeat;}

(dfn/defstyles sidebar-base
    [:sidebar_base {:width (u/px 224)
                             :height (u/px 14)
                             :background "transparent url(side_bar.png) no-repeat"}])

;;.sidebar
;;{ float: right;
;;  width: 222px;
;;  padding: 0;
;;  margin: 0 0 16px 0;}

(dfn/defstyles sidebar
  {:float "right"
          :width (u/px 222)
          :padding 0
          :margin "0 0 16px 0"})

;;  .sidebar_item
;; { background: url(side_back.png) repeat-y;
;;          padding: 0 15px;
;;            width: 192px;}

(dfn/defstyles sidebar-item
  [:.siderbar_item {:background "url(side_back.png) repeat-y"
                           :padding "0 15px"
                           :width (u/px 192)}])

;;            .sidebar li a.selected
;;            { color: #444;}
(dfn/defstyles sidebar-li-a-selected
  [:sidebar [:li :a.selected {:color "#444"}]])


;;             .sidebar ul
;;             { margin: 0;}

(dfn/defstyles sidebar-ul
  [:sidebar [:ul {:margin 0}]])

;;              #content
;;              { text-align: left;
;;                 width: 620px;
;;                   padding: 0 0 0 5px;
;;                     float: right;}

(dfn/defstyles content
  [:content {:text-align "left"
                    :width (u/px 620)
                    :padding "0 0 0 5px"
                    :float "right"}])

;;                     #content ul
;;                     { margin: 2px 0 22px 0px;}
(dfn/defstyles hash-content-ul
  [:hash-content-ul {:margin "2px 0 22px 0px"}])

;;                      #content ul li, .sidebar ul li
;;                      { list-style-type: none;
;;                         background: url(bullet.png) no-repeat;
;;                           margin: 0 0 0 0;
;;                             padding: 0 0 4px 25px;
;;                               line-height: 1.5em;}


(dfn/defstyles hash-content-ul-li-sidebar-ul-li
  [:#content :#sidebar [:ul [:li {:list-style-type "none"
                                         :background "url(bullet.png) no-repeat"
                                         :margin "0 0 0 0"
                                         :padding "0 0 4px 25px"
                                         :line-height (u/em 1.5)}]]])


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
(dfn/defstyles hash-footer
  [:#footer {:width (u/percent 100)
                    :font-family "'trebuchet ms', sans-serif"
                    :font-size (u/percent 100)
                    :height (u/px 80)
                    :padding "28px 0 5px 0"
                    :text-align "center"
                    :background "#CCC"
                    :border-top "1px solid #AAA"
                    :color "#FFF"}])

(dfn/defstyles hash-footer-p
  [:#footer [:p {:line-height (u/em 1.7)
                        :padding "0 0 10px 0" }]])


;;                 #footer p
;;                 { line-height: 1.7em;
;;                    padding: 0 0 10px 0;}


;;                    #footer a
;;                    { color: #FFF;
;;                       text-decoration: none;}

(dfn/defstyles  hash-footer-a
  [:#footer [:a {:color "#FFF"
                        :text-decoration "none"}]])

;;#footer a:hover
;;{ color: #00C6F0;
;;text-decoration: none;}

(dfn/defstyles hash-footer-a-hover
  [:#footer [:a:hover {:color "#00C6F0"
                              :text-declaration "none"}]])

;;.search
;;{ color: #5D5D5D;
;;    border: 1px solid #BBB;
;;    width: 134px;
;;padding: 4px;
;;font: 100% arial, sans-serif;}

(dfn/defstyles dot-search
  [:.search  {:color "#5D5D5D"
                     :border "1px solid #BBB"
                     :width (u/px 134)
                     :padding (u/px 4)
                     :font "100% arial, sans-seri"}])

;;.form_settings
;;{ margin: 15px 0 0 0;}
(dfn/defstyles dot-form-settings
  [:.form_settings {:margin "15px 0 0 0"}])

;;.form_settings p
;;{ padding: 0 0 4px 0;}
(dfn/defstyles dot-from-settings-p
  [:.form_settings {:padding "0 0 4px 0"}])

;;.form_settings span
;;{ float: left;
;;width: 200px;
;;text-align: left;}

(dfn/defstyles form-settings-span
  [:.form_settings [:span {:float "left"
                                  :width (u/px 200)
                                  :text-align "left"}]])

;;form_settings input, .form_settings textarea
;;{ padding: 5px;
;;width: 299px;
;;font: 100% arial;
;;border: 1px solid #E5E5DB;
;;background: #FFF;
;;color: #47433F;}

(dfn/defstyles form-settings-input-textarea
  [:form_settings [:input :textarea {:padding (u/px 5)
                                            :width (u/px 299)
                                            :font "100% arial"
                                            :border "1px solid #E5E5D8"
                                            :background "#FFF"
                                            :color "#47433F"}]])

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
(dfn/defstyles dot-form-settings-dot-submit
  [:.form_settings [:.submit {:border 0
                                     :width (u/px 99)
                                     :margin "0 0 0 212px"
                                     :height (u/px 33)
                                     :padding "2px 0 3px 0"
                                     :cursor "pointer"
                                     :background "#3B3B3B"
                                     :color "#FFF"}]])

;;                 .form_settings textarea, .form_settings select
;;                 { font: 100% arial;
;;                    width: 299px;}

(dfn/defstyles dot-form-settings-textarea-select
  [:.form_settings [:textarea :select {:font "100% arial"
                                              :width (u/px 299)}]])

;;                    .form_settings select
;;                    { width: 310px;}
(dfn/defstyles dot-form-settings-select
  [:.form_settings [:select {:width (u/px 310)}]])

;;   .form_settings .checkbox
;;   { margin: 4px 0;
;;     padding: 0;
;;     width: 14px;
;;     border: 0;
;;     background: none;}
(dfn/defstyles  dot-form-settings-checkbox
  [:.form_settings [:.checkbox {:margin "4px 0"
                                       :padding "0"
                                       :width (u/px 14)
                                       :border 0
                                       :background "none"}]])


(dfn/defstyles separator
      [:.separator {:width (u/px 100)
                           :height 0
                           :border-top "1px slid #D9D5CF"
                           :border-bottom "1px solid #FFF"
                           :margin "0 0 20px 0"}])

;;   table
;;  { margin: 10px 0 30px 0;}
(dfn/defstyles table
    [:table {:margin "10px 0 30px 0"}])

;;  table tr th, table tr td
;; { background: #3B3B3B;
;;color: #FFF;
;;padding: 7px 4px;
;;text-align: left;}
(dfn/defstyles table-tr-th-td
      [:table [:tr [:th :td {:background "#3B3B3B"
                                    :color "#FFF"
                                    :padding "7px 4px"
                                    :text-align "left"}]]])

;;table tr td
;;{  background: #E5E5DB;
;;   color: #47433F;
;;   border-top: 1px solid #FFF;}
(dfn/defstyles table-tr-td
      [:table [:tr [:td {:background "#E5E5D8"
                                :color "#47433F"
                                :border-top "1px solid #FFF"}]]])

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
    a-a-hover
    a-hover
    blockquote
    ul
    ul-li
    ol
    ol-li
    left
    right
    center
    main-logo-menubar-site_content-footer
    hash-header
    hash-banner
    hash-logo
    hash-logo-logo_text
    hash-h1-h2
    hash-logo-a-text-colour
    hash-log_text-a-hover-logo_colour
    hash-logo-text-h1-a-hover
    hash-logo-text
    hash-menubar
    ul-hash-menu
    ul-hash-menu-li
    ul-hash-menu-li-a
    ul-hash-menu-li-selected-a
    ul-hash-menu-li-selected
    ul-menu-li-selected-a-hover
    ul-menu-li-a-hover
    hash-site-content
    hash-sidebar-container
    sidebar-top
    sidebar-base
    sidebar
    sidebar-item
    sidebar-li-a-selected
    sidebar-ul
    content
    hash-content-ul
    hash-content-ul-li-sidebar-ul-li
    hash-footer
    hash-footer-p
    hash-footer-a
    hash-footer-a-hover
    dot-search
    dot-form-settings
    dot-from-settings-p
    form-settings-span
    form-settings-input-textarea
             dot-form-settings-dot-submit
             dot-form-settings-textarea-select
             dot-form-settings-select
             dot-form-settings-checkbox
             separator
             table
             table-tr-th-td
             table-tr-td)
