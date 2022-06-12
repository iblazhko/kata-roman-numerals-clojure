(ns kata-roman-numerals-clojure.roman-numerals-test
  (:require [clojure.test :refer :all]
            [kata-roman-numerals-clojure.roman-numerals :refer [romanize]]))

(defn run-test-cases
  [test-name test-cases]
  (testing test-name
    (doseq [test-case test-cases]
      (let [number (first test-case)
            expected-romans (second test-case)]
        (testing (str number " -> " expected-romans)
          (is (= (romanize number) expected-romans)))))))

(deftest romanize-0-translates-to-empty-string
  (testing "0 translates to empty string"
    (is (= (romanize 0)
           ""))))

(deftest romanize-2-translates-to-II
  (testing "2 -> II"
    (is (= (romanize 2)
           "II"))))

(deftest romanize-4-translates-to-IV
  (testing "4 -> IV"
    (is (= (romanize 4)
           "IV"))))

(deftest romanize-single-numeral
  (run-test-cases
   "Single letter roman numerals"
   [[1, "I"],
    [5, "V"],
    [10, "X"],
    [50, "L"],
    [100, "C"],
    [500, "D"],
    [1000, "M"]]))

