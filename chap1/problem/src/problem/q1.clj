(ns problem.q1)

(defn sum
	([x y] (+ x y))
	([x y z] (+ x y z)))

(defn minus
 	[x y]
	(- x y))

(defn divide
 	[x y]
	(/ x y))

(defn multiply
 	[x y]
	(* x y))

(defn a3
 	[x y z]
	(cond 
	 	(and (> x z) (> y z)) (sum (* x x) (* y y) z)
	 	(and (> x z) (> z y)) (sum (* x x) (* z z) y)
		:else (sum x (* y y) (* z z))
	 )
	)

(defn a4
	[x y]
	((if (> y 0) + -) x y)
)

(defn pro [] (throw (Exception. "test")))

(defn a5
	[x y]
	(if (= x 0) 0 y)
)
