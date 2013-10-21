(ns clojummendations.views
  (:use hiccup.core
        hiccup.page))

(defn index-page []
  (html5 [:h1 "welcome to the JUNGLE!"]))
