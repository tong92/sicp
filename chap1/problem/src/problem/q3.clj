(ns problem.q3)

(defn q9-recur
  [x y]
  (if (= x 0)
    y
    (inc (q9-recur (dec x) y))
  )
)

(defn q9-iter
  [x y]
  (if (= x 0)
    y
    (q9-iter (dec x) (inc y))
  )
)

(defn q10
  [x y]
  (cond 
    (= y 0) 0
    (= x 0) (* 2 y)
    (= y 1) 2
    :else (q10 (- x 1) (q10 x (- y 1)))
  )
)

(defn q10-f
  [n]
  (q10 0 n)
)

(defn q10-g
  [n]
  (q10 1 n)
)

(defn q10-h
  [n]
  (q10 2 n)
)

(defn q10-k
  [n]
  (* 5 n n)
)
