(ns problem.book-test
  (:require [clojure.test :refer :all]
            [problem.book :refer :all]))

(deftest sqrt-test
	(testing "sqrt test"
		(is (= (sqrt 2) 1.4142156862745097))
		(is (= (sqrt 9) 3.00009155413138))
		(is (= (sqrt (+ 100 37)) 11.704699917758145))
		(is (= (sqrt (+ (sqrt 2) (sqrt 3))) 1.7739279023207892))
	)
)
