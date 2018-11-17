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

(deftest fib-recur-test
	(testing "fib-recur-simple-test"
		(is (= (fib-recur 10) 55))
	)
)

(deftest fib-iter-test
	(testing "fib-iter-simple-test"
		(is (= (fib-iter 10) 55))
	)
)

(deftest count-change-test
	(testing "count-change-simple-test"
		(is (= (count-change 100) 292))
	)
)

; (deftest expt-test
; 	(testing
; 		(is (= (expt-recur 3 129) 68630377364883))
; 		(is (= (expt-iter 3 129) 68630377364883))
; 		(is (= (expt-log 3 129) 68630377364883))
; 	)
; )