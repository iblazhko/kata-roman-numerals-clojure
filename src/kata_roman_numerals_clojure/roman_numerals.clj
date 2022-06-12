(ns kata-roman-numerals-clojure.roman-numerals
  (:require [clojure.spec.alpha :as spec]))

(def buckets {1 "I",
              5 "V",
              10 "X",
              50 "L",
              100 "C",
              500 "D",
              1000 "M",
              4 "IV",
              9 "IX",
              40 "XL",
              90 "XC",
              400 "CD",
              900 "CM"})

(defn find-largest-bucket
  [number]
  (let [bucket-size (apply max (filter #(<= % number) (keys buckets)))]
    [bucket-size (get buckets bucket-size)]))

(defn process-bucket
  [numerals reminder]
  (if (= reminder 0)
    (apply str numerals)
    (let [bucket (find-largest-bucket reminder)
          bucket-size (first bucket)
          bucket-numerals (second bucket)]
      (process-bucket
       (conj numerals bucket-numerals)
       (- reminder bucket-size)))))

(defn romanize
  "Translate a number to Roman Numerals string representation."
  [number]
  {:pre [(number? number)
         (>= number 0)]}
  (process-bucket [] number))
