(ns problem.q5-test
  (:require [clojure.test :refer :all]
            [problem.q5 :refer :all]
						[problem.book :refer :all]))

(deftest q14-test
	(testing "q14 test"
		(is (= (count-change 11) 4))
		(is (= (count-change 100) 292))
		; (is (= (count-change 1111) 1195264))
	)
)

(deftest q15-test
	(testing "q15 test a"
		(is (= (q15 12.15) (- 0.39980345741334))) ; 5 times
	)
	"15 b: n (linear)"
)
