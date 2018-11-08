(ns problem.q1-test
  (:require [clojure.test :refer :all]
            [problem.q1 :refer :all]))

(deftest q1-test
  (testing "q1 simple test"
    (is (= (sum 5 3 4) (+ 5 3 4)))
		(is (= (minus 9 1) (- 9 1)))	
		(is (= (divide 6 2) (/ 6 2)))
		(is (= (sum (multiply 2 4) (minus 4 6)) (+ (* 2 4) (- 4 6))))
	)
	(testing "q1 define test"
		(def a 3)
		(def b (+ a 1))
		(is (= (sum a b (multiply a b)) (+ a b (* a b))))
		(is (= false (= a b)))
	 ))

(deftest q3-test
 (testing "q3 test"
 		(is (= (a3 1 2 3) (+ 1 (* 2 2) (* 3 3))))
 		(is (= (a3 4 2 3) (+ 2 (* 4 4) (* 3 3))))
	)
 )

(deftest q4-test
	(testing "q4 test"
		(is (= (a4 1 2) (a4 1 (- 2))))
		(is (= (a4 0 2) (a4 0 (- 2))))
		(is (= (a4 (- 1) 2) (a4 (- 1) (- 2))))
	)
)

(deftest q5-test
	(testing "q5 test"
		(is (not= (a5 0 pro) pro))
		(is (= (a5 0 pro) 0))
	)
)
