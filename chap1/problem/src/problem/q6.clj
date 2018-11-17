(ns problem.q6
  (:require [problem.book :refer :all]))

(defn q16-inner
  [x n res]
  (cond
    (= n 0) res
    (even? n) (q16-inner (* x x) (/ n 2) res)
    :else (q16-inner x (- n 1) (* res x))
  )
)

(defn q16
  [x n]
  (q16-inner x n 1)
)

(defn q17
  [x n]
  (cond 
    (= n 0) 1
    (even? n) (q17 (* x x) (/ n 2)) ; double, halve
    :else (* x (q17 x (- n 1)))
  )
)

(defn q18-inner
  [x n res]
  (cond
    (= n 0) res
    (even? n) (q18-inner (* x x) (/ n 2) res) ;double, halve
    :else (q18-inner x (- n 1) (* res x)) ; multiply
  )
)

(defn q18
  [x n]
  (q18-inner x n 1)
)

(defn fib-iter'
  [a b p q count]
  (cond 
    (= count 0) b
    (even? count) 
      (fib-iter' 
        a 
        b 
        (+ (* p p) (* q q))
        (+ (* 2 p q) (* q q))
        (/ count 2)
      )
    :else 
      (fib-iter' 
        (+ (* b q) (* a q) (* a p))
        (+ (* b p) (* a q))
        p
        q
        (- count 1)
      )
  )
)

(defn q19
  [n]
  (fib-iter' 1 0 0 1 n)
)