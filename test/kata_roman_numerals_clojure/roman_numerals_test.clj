(ns kata-roman-numerals-clojure.roman-numerals-test
  (:require [clojure.test :refer :all]
            [kata-roman-numerals-clojure.roman-numerals :refer [romanize]]))

(deftest romanize-0-translates-to-empty-string
  (testing "0 translates to empty string"
    (is (= (romanize 0)
           ""))))

(deftest romanize-1-translates-to-I
  (testing "1 -> I"
    (is (= (romanize 1)
           "I"))))

(deftest romanize-5-translates-to-V
  (testing "5 -> V"
    (is (= (romanize 5)
           "V"))))
