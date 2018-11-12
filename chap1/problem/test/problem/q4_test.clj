(ns problem.q4-test
  (:require [clojure.test :refer :all]
            [problem.q4 :refer :all]
						[problem.book :refer :all]))

(deftest q11-test
	(testing "q11-recur test"
		(is (= (q11-recur 1) 1))
		(is (= (q11-recur 2) 2))
		(is (= (q11-recur 3) 4))
		(is (= (q11-recur 4) 11))
		(is (= (q11-recur 5) 25))
		(is (= (q11-recur 6) 59))
		(is (= (q11-recur 7) 142))
		(is (= (q11-recur 10) 1892))
	)
	(testing "q11-iter test"
		(is (= (q11-iter 1) 1))
		(is (= (q11-iter 2) 2))
		(is (= (q11-iter 3) 4))
		(is (= (q11-iter 4) 11))
		(is (= (q11-iter 5) 25))
		(is (= (q11-iter 6) 59))
		(is (= (q11-iter 7) 142))
		(is (= (q11-iter 10) 1892))
	)
)

(deftest q12-test
	(testing "q12-value test"
		(is (= (q12-value 1 1) 1))
		(is (= (q12-value 2 1) 1))
		(is (= (q12-value 2 2) 1))
		(is (= (q12-value 3 1) 1))
		(is (= (q12-value 3 2) 2))
		(is (= (q12-value 3 3) 1))
		(is (= (q12-value 4 1) 1))
		(is (= (q12-value 4 2) 3))
		(is (= (q12-value 4 3) 3))
		(is (= (q12-value 4 4) 1))
		(is (= (q12-value 5 1) 1))
		(is (= (q12-value 5 2) 4))
		(is (= (q12-value 5 3) 6))
		(is (= (q12-value 5 4) 4))
		(is (= (q12-value 5 5) 1))
	)

	(testing "q12 test"
		(is (= (q12 1) [[1]] ))
		(is (= (q12 2) [[1][1 1]] ))
		(is (= (q12 3) [[1][1 1][1 2 1]] ))
		(is (= (q12 4) [[1][1 1][1 2 1][1 3 3 1]] ))
		(is (= (q12 5) [[1][1 1][1 2 1][1 3 3 1][1 4 6 4 1]] ))
	)
)

(def rf (Math/pow 5.0 0.5))
(defn pi 
	[n]
	(Math/pow (/ (+ 1 rf) 2) n)
)
(defn psi 
	[n]
	(Math/pow (/ (- 1 rf) 2) n)
)
(defn pi-test
	[n]
	(/ (pi n) rf)
)
(defn pp-test
	[n]
	(/ (- (pi n) (psi n)) rf)
)

(deftest q13
	(testing "fib for q13"
		(is (= (fib-iter 3) (pi-test 3)))
		(is (= (fib-iter 5) (pi-test 5)))
		(is (= (fib-iter 7) (pi-test 7)))
		(is (= (fib-iter 50) (pi-test 50)))
	)
	(testing "fib for q13"
		(is (= (fib-iter 3) (pp-test 3)))
		(is (= (fib-iter 5) (pp-test 5)))
		(is (= (fib-iter 7) (pp-test 7)))
		(is (= (fib-iter 50) (pp-test 50)))
	)
)
