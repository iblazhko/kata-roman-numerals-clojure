(ns kata-roman-numerals-clojure.roman-numerals-test
  (:require [clojure.test :refer :all]
            [kata-roman-numerals-clojure.roman-numerals :refer :all]))

(deftest romanize-0-translates-to-empty-string
  (testing "0 translates to empty string"
    (is (= (romanize 0)
           ""))))
