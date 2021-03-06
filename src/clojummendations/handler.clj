(ns clojummendations.handler
  (:use compojure.core
        clojummendations.views)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] (index-page))
  (GET "/artist" {params :params}
    (single-artist-page (params :artist)))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
