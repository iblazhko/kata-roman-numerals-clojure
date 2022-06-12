(defproject kata-roman-numerals-clojure "0.1.0-SNAPSHOT"
  :description "TDD exercise - Roman Numerals"
  :url "https://github.com/iblazhko/kata-roman-numerals-clojure"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :main ^:skip-aot kata-roman-numerals-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
