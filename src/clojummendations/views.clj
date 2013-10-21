(ns clojummendations.views
  (:use hiccup.core
        hiccup.page))
;FIXME: Should this go into templates.clj or something like that?
(defn layout [content]
  (html5
    [:head
      [:title "Clojummendations, the best way to get recommendations for the music you listen"]
      (include-css "//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-combined.min.css")
      (include-css "/css/style.css")]
    [:body
      [:div {:class "navbar"}
        [:div {:class "navbar-inner"}
        [:div {:class "container"}
          [:a {:class "brand" :href "/"} "Clojummendations"]]]]
      [:div {:class "container content"}
        content
        [:footer
          [:span "Proudly powered by Clojure :) | Built with love by jlgarcia"]]
        ]]))

(defn index-page []
  (layout
    [:div {:class "starter-template"}
      [:h1 "Welcome to the Jungle!"]
      [:p {:class "lead"} "Clojummendations try to recommend you the best music, try it out!"]]))

(defn artists-page []
  (layout [:span "This is a placeholder for a page that will contain a set of last searched artists... or something like that"]))
