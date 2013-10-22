(ns clojummendations.views
  (:use hiccup.core
        hiccup.page
        clojummendations.models))

;FIXME: Should this go into templates.clj or something like that?
(defn layout
  "Base layout for Clojummendations"
  [content]
  (html5
    [:head
      [:title "Clojummendations, the best way to get recommendations for the music you listen"]
      (include-css "//netdna.bootstrapcdn.com/twitter-bootstrap/3.0.0/css/bootstrap.min.css")
      (include-css "/css/style.css")]
    [:body
      [:div {:class "navbar navbar-inverse navbar-fixed-top"}
        [:div {:class "container"}
          [:div {:class "navbar-header"}
            [:a {:class "navbar-brand" :href "/"} "Clojummendations"]]
          [:div {:class "navbar-collapse collapse"}
            [:form {:action "/artist" :class "navbar-form navbar-right"}
              [:div {:class "form-group"}
                [:input {:name "artist" :type "text" :class "form-control" :placeholder "Artist name"}]]
              [:input {:type "submit" :class "btn btn-primary"}]]]]]
      [:div {:class "container content"}
        content
        [:div {:class "clear"}]]]))

(defn index-page
  "View for the index page"
  []
  (layout
    [:div {:class "starter-template"}
      [:h1 "Welcome to the Jungle!"]
      [:p {:class "lead"} "Clojummendations tries to recommend you the best music, try it out!"]
      [:form {:action "/artist"}
        [:input {:name "artist" :class "form-control" :type "text" :placeholder "Enter the name of an artist"}]
        [:input {:type "submit" :value "search clojummendations" :class "btn btn-primary"}]]]))

(defn artists-page []
  "View For the artists page"
  (layout [:span "This is a placeholder for a page that will contain a set of last searched artists... or something like that"]))

(defn artist-template
  "template for displaying each single result of an artist"
  [artist-name artist-image artist-url]
  (html5
    [:div {:class "artist"}
      [:img {:src artist-image}]
      [:a {:href artist-url}
        [:div {:class "artist-name"} artist-name]]]))

(defn single-artist-page [artist]
  "View for the single artist page"
  (layout [:div {:class "columns"} (display-related-artists artist artist-template)]))
