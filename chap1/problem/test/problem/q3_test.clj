(ns problem.q3-test
  (:require [clojure.test :refer :all]
            [problem.q3 :refer :all]))
(deftest q10-test
	(testing "q10 test"
		(is (= (q10 1 10) 1024))
		(is (= (q10 2 4) 65536))
		(is (= (q10 3 3) 65536))
	)

	(testing "q10-f test"
    "q10-f is 2 * n"
		(is (= (q10-f 10) 20))
		(is (= (q10-f 4) 8))
		(is (= (q10-f 3) 6))
	)

	(testing "q10-g test"
    "q10-g is 2 ^ n"
		(is (= (q10-g 16) 65536))
		(is (= (q10-g 10) 1024))
		(is (= (q10-g 4) 16))
		(is (= (q10-g 3) 8))
	)

	(testing "q10-h test"
    "q10-h is 2 ^ (q10-h (- n 1))"
		(is (= (q10-h 4) 65536))
		(is (= (q10-h 3) 16))
		(is (= (q10-h 2) 4))
	)
)
