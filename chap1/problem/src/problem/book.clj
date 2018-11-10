(ns problem.book)

(defn abs
 	[x]
	(if (> x 0) x (- x))
)
(defn square
 	[x]
	(* x x)
)
(defn average
	[x y]
	(/ (+ x y) 2)
)
(defn improve
 	[guess x]
	(average guess (/ x guess))
)

(defn goodEnough?
	[guess x]
	(< 
	 	(abs 
		 	(- 
			 	(square guess) 
				x
			) 
		 )
		0.001
	)
)

(defn sqrtIter 
  [guess x]
	(if (goodEnough? guess x) guess
		(sqrtIter (improve guess x) x)
	)	 
)
(defn sqrt
	[x]
	(sqrtIter 1.0 x)
)
