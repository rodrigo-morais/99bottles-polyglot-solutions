(defproject beer-song "0.1.0"
  :description "Beer song challenge"
  :dependencies [[org.clojure/clojure "1.8.0"]
                [org.clojure/core.match "0.3.0-alpha5"]]
  :main ^:skip-aot beer-song
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
