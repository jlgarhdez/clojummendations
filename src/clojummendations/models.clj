(ns clojummendations.models
  (:require [clj-http.client :as http]
            [clojure.data.json :as json]))

;FIXME: replace with an actual API key
(def api-key "")

;Last.fm api url
(def api-url "http://ws.audioscrobbler.com/2.0/")

(defn get-json
  "Calls the API and retrieves a parsed JSON"
  [url]
  (json/read-str ((http/get url) :body)))

(defn construct-url
  "creates a url given an artist"
  [artist]
  (str api-url "?format=json&api_key=" api-key "&method=artist.getSimilar&artist=" artist))

(defn get-related-artists
  "Calls the API and retrieves a JSON of artists related to the given artist"
  [json]
  (if (not (string? (get (get json "similarartists") "artist"))) ; Checks if the query returned something
    (map
      (fn [artist] ; This function returns the image, url and name of each artist
        {:name (get artist "name")
         :url (str "http://" (get artist "url"))
         :image (((get artist "image") 3) "#text")})
      (get (get json "similarartists") "artist"))
    false))

