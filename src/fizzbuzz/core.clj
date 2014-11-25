(ns fizzbuzz.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn is-divisible-by?[number divisor]
	(zero? (mod number divisor)))

(defn is-divisible-by-three? [number]
	(is-divisible-by? number 3))

(defn is-divisible-by-five? [number]
	(is-divisible-by? number 5))