(ns kata-roman-numerals-clojure.roman-numerals)

(def ^:private
  buckets {1 "I",
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

(defn- find-largest-bucket
  [number]
  (let [bucket-size (apply max (filter #(<= % number) (keys buckets)))]
    [bucket-size (get buckets bucket-size)]))

(defn- process-bucket
  [numerals reminder]
  (if (= reminder 0)
    (apply str numerals)
    (let [bucket (find-largest-bucket reminder)
          bucket-size (first bucket)
          bucket-numerals (second bucket)]
      (recur
       (conj numerals bucket-numerals)
       (- reminder bucket-size)))))

(defn romanize
  "Translate a number to Roman Numerals string representation."
  [n]
  {:pre [(integer? n)
         (>= n 0)
         (< n 4000)]}
  (process-bucket [] n))
