(defproject t1.core "0.1.0-SNAPSHOT"
  ;; :url "http://jponline.github.io/site"

  :min-lein-version "2.9.1"

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.597"]
                 [reagent "0.10.0"]]

  :source-paths ["src"]

  :aliases {"fig:prod-repl" ["trampoline" "run" "-m" "figwheel.main" "-b" "prod" "-r"]}

  :profiles {:dev
             {:resource-paths ["target"]
              :clean-targets ^{:protect false} ["target"]
              :dependencies [[com.bhauman/figwheel-main "0.2.3"]
                             [com.bhauman/rebel-readline-cljs "0.1.4"]]
              :repl-options  {:port 12344}}
             :cards
             {:resource-paths ["target"]
              :clean-targets ^{:protect false} ["target"]
              :dependencies [[com.bhauman/figwheel-main "0.1.9"]
                             [com.bhauman/rebel-readline-cljs "0.1.4"]]}})
