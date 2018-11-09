(ns problem.q2-test
  (:require [clojure.test :refer :all]
            [problem.q2 :refer :all]))

(deftest sqrt-test
	(testing "sqrt test"
		(is (= (sqrt 2) 1.4142156862745097))
		(is (= (sqrt 9) 3.00009155413138))
		(is (= (sqrt (+ 100 37)) 11.704699917758145))
		(is (= (sqrt (+ (sqrt 2) (sqrt 3))) 1.7739279023207892))
	)
)


(deftest q6-test
	(testing "q6 test"
		(is (= (q6 1.0 2) 1.4142156862745097))
		(is (= (q6 1.0 9) 3.00009155413138))
		(is (= (q6 1.0 (+ 100 37)) 11.704699917758145))
		(is (= (q6 1.0 (+ (sqrt 2) (sqrt 3))) 1.7739279023207892))
	)
)

