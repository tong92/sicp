(ns problem.q5
  (:require [problem.book :refer :all]))

(defn cube [x] 
  (* x x x)
)

(defn p [x]
  (- (* 3 x) (* 4 (cube x)))
)

(defn q15
  [angle]
  (if (not (> (abs angle) 0.1))
    angle
    (p (q15 (/ angle 3.0)))
  )
)