(defproject repro "0.0.1"
  :main repro.main
  :plugins [[lein-tools-deps "0.4.5"]]
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]
  :lein-tools-deps/config {:config-files [:install :user :project]}
  :source-paths []
  :resource-paths []
  :uberjar-name "repro.jar"
  :profiles {:uberjar {:aot :all}})

