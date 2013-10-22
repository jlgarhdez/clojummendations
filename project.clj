(defproject clojummendations "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/data.json "0.2.3"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.4"]
                 [clj-http "0.7.7"]]
  :plugins [[lein-ring "0.8.5"]]
  :ring {:handler clojummendations.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.5"]]}})
