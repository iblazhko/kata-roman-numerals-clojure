(ns kata-roman-numerals-clojure.core-test
  (:require [clojure.test :refer :all]
            [kata-roman-numerals-clojure.core :refer :all]))

(deftest romanize-0-translates-to-empty-string
  (testing "0 translates to empty string"
    (is (= (romanize 0)
           ""))))
