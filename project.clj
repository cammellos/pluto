(defproject pluto "SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.238"]
                 [org.clojure/tools.reader "1.2.1"]
                 [reagent "0.8.0"]
                 [re-frame "0.10.5"]
                 [binaryage/devtools "0.9.10"]
                 [day8.re-frame/re-frame-10x "0.3.2"]]

  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-doo "0.1.10"]]

  :source-paths ["src"]

  :cljsbuild {:builds [{:id "tests"
                        :source-paths ["src" "test"]
                        :compiler {:output-to "target/testable.js"
                                   :optimizations :none
                                   :cache-analysis false
                                   :target :nodejs
                                   :main "pluto.demo"
                                   :pretty-print true}}]})