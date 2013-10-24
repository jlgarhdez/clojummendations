# clojummendations

Clojummendations is a simple service to get recommendations for music, based on artist
names.

## Prerequisites

You will need [Leiningen][1] 1.7.0 or above and a [Lastfm][2] API key. You'll have to
write your API key in [models.clj][3]

[1]: https://github.com/technomancy/leiningen
[2]: http://last.fm
[3]: https://github.com/jlgarhdez/clojummendations/blob/master/src/clojummendations/models.clj#L6

## Running

To start a web server for the application, run:

    lein ring server

## Clojure packages used in this software

* org.clojure/clojure "1.5.1"
* org.clojure/data.json "0.2.3"
* compojure "1.1.5"
* hiccup "1.0.4"
* clj-http "0.7.7"

## License
Copyright (C) 2013 José Luis García Hernández <jl.garhdez@gmail.com>

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
