(ns problem.q6-test
  (:require [clojure.test :refer :all]
            [problem.q6 :refer :all]
						[problem.book :refer :all]))

(deftest q16-test
	(testing "q16 test"
		(is (= (q16 2.0 4) (Math/pow 2 4) ))
		(is (= (q16 3.0 4) (Math/pow 3 4) ))
		(is (= (q16 3.0 9) (Math/pow 3 9) ))
		(is (= (q16 5.0 13) (Math/pow 5 13) ))
	)
)

(deftest q17-test
	(testing "q17 test"
		(is (= (q17 2.0 4) (Math/pow 2 4) ))
		(is (= (q17 3.0 4) (Math/pow 3 4) ))
		(is (= (q17 3.0 9) (Math/pow 3 9) ))
		(is (= (q17 5.0 13) (Math/pow 5 13) ))
	)
)

(deftest q19-test
	(testing "q19 test"
		(is (= (q19 2) (fib-iter 2) ))
		(is (= (q19 4) (fib-iter 4) ))
		(is (= (q19 8) (fib-iter 8) ))
		(is (= (q19 10) (fib-iter 10) ))
		(is (= (q19 13) (fib-iter 13) ))
	)
)

