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

(defn fib-recur
 	[n]
	(cond 
		(= n 0) 0
		(= n 1) 1
		:else (+ 
			(fib-recur (- n 1))
			(fib-recur (- n 2))
		)
	)
)

(defn fib-iter-inner
	[x y ct]
	(if (= ct 0)
		y
		(fib-iter-inner (+ x y) x (- ct 1))
	)
)

(defn fib-iter
	[n]
	(fib-iter-inner 1 0 n)
)

(defn first-denomination 
	[kinds-of-coins]
	(cond 
		(= kinds-of-coins 1) 1
		(= kinds-of-coins 2) 5
		(= kinds-of-coins 3) 10
		(= kinds-of-coins 4) 25
		(= kinds-of-coins 5) 50
	)
) 

(defn cc 
	[amount kinds-of-coins]
	(cond 
		(= amount 0) 1 
		(or (< amount 0) (= kinds-of-coins 0)) 0 
		:else (+ 
			(cc amount (- kinds-of-coins 1)) 
			(cc (- amount (first-denomination kinds-of-coins)) kinds-of-coins)
		)
	)
)

(defn count-change 
	[amount] 
	(cc amount 5)
)
