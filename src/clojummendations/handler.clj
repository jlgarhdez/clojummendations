(ns clojummendations.handler
  (:use compojure.core
        clojummendations.views)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] (index-page))
  (GET "/artists" [] (artists-page))
  (GET "/artist/:artist" [artist] (single-artist-page artist))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
