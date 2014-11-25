(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest is-divisible-by-three
	(testing "returns true for 3"
		(is(= true (is-divisible-by-three? 3)))))

(deftest is-not-divisible-by-three
	(testing "returns false for 1"
		(is(= false(is-divisible-by-three? 1)))))

(deftest is-divisible-by-five
	(testing "returns true for 5"
		(is(= true(is-divisible-by-five? 5)))))

(deftest is-not-divisible-by-five
	(testing "returns false for 1"
		(is(= false(is-divisible-by-five? 1)))))

(deftest is-divisible-by-fifteen
	(testing "returns true for 15"
		(is(= true(is-divisible-by-fifteen? 15)))))

(deftest is-not-divisible-by-fifteen
	(testing "returns false for 1"
		(is(= false(is-divisible-by-fifteen? 1)))))

(deftest returns-fizz-for-multiples-of-three
	(testing "returns 'fizz' for a number divisible by 3"
		(is(="fizz"(fizzbuzz 3)))))

(deftest returns-buzz-for-multiples-of-five
	(testing "returns 'buzz' for a number of divisible by 5"
		(is (="buzz" (fizzbuzz 5)))))

(deftest returns-fizzbuzz-for-multiples-of-fifteen
	(testing "returns 'fizzbuzz' for a number of divisible by 15"
		(is (="fizzbuzz" (fizzbuzz 15)))))