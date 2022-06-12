(ns kata-roman-numerals-clojure.roman-numerals)
(require '[clojure.core.match :refer [match]])

(defn romanize
  "Translate a number to Roman Numerals string representation."
  [number]
  (match number
    1 "I"
    5 "V"
    :else ""))
