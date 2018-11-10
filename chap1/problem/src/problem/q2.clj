(ns problem.q2
	(:require [problem.book :refer :all]))

(defn new-if [predicate then-clause else-clause]
	(cond 
	 	predicate then-clause
	 	:else else-clause)
)

(defn q6
	[guess x]
	(new-if (goodEnough? guess x)
	 	guess
		(sqrtIter (improve guess x) x))
)
