(ns problem.q4)

(defn q11-recur
  [n]
  (if (< n 3)
    n
    (+ 
      (q11-recur (- n 1))
      (* (q11-recur (- n 2)) 2)
      (* (q11-recur (- n 3)) 3)
    )
  )
)

(defn q11-iter-inner
  [a b c ct]
  (cond
    (= ct 1) b
    (= ct 2) a
    :else (
      q11-iter-inner 
      (+ a (* b 2) (* c 3)) a b
      (- ct 1)
    )
  )
)

(defn q11-iter
  [n]
  (q11-iter-inner 2 1 0 n)
)

(defn q12-value
  [line idx]
  (cond
    (or (= line 0) (= idx 0)) 0
    (or (= idx 1) (= line idx)) 1
    :else (+ 
      (q12-value (- line 1) (- idx 1))
      (q12-value (- line 1) idx)
    )
  )
)

(defn q12-line
  [n]
  (for [x (range 1 (+ n 1))]
    (q12-value n x)
  )
)

(defn q12
  [n]
  (if
    (= n 0) []
    (conj (q12 (- n 1)) (q12-line n))
  )
)