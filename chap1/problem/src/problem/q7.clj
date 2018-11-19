(ns problem.q7
  (:require [problem.book :refer :all]))

(defn gcd
  [a b]
  (if (= b 0)
    a
    (gcd b (rem a b))
  )
)

; normal-order
; (gcd [206 40])
; (if (= 40 0)
;   206
;   (gcd [40 (rem 206 40)])
; )

; (if (= (rem 206 40) 0)
;   40
;   (gcd [(rem 206 40) (rem 40 (rem 206 40))])
; )
; ;1
; (if (= (rem 40 (rem 206 40)) 0)
;   (rem 40 (rem 206 40))
;   (gcd [
;     (rem 40 (rem 206 40)) 
;     (rem (rem 206 40) (rem 40 (rem 206 40)))
;   ])
; )
; ;1 + 2
; ;A = (rem 40 (rem 206 40))
; (if (= (rem (rem 206 40) A) 0)
;   (rem (rem 206 40) A)
;   (gcd [
;     (rem (rem 206 40) A) 
;     (rem A (rem (rem 206 40) A))
;   ])
; )
; ;1 + 2 + 4
; ;B = (rem (rem 206 40) A) = (rem (rem 206 40) (rem 40 (rem 206 40)))
; (if (= (rem A B) 0)
;   B
;   (gcd [
;     (rem A B)
;     (rem B (rem A B))
;   ])
; )
; ;1 + 2 + 4 + 7
; ;LAST
; (rem (rem 206 40) (rem 40 (rem 206 40)))
; ;1 + 2 + 4 + 7 + 4 = 18
; 2

; applicative-order
; (gcd 206 40)
; (gcd 40 (rem 206 40))
; (gcd 40 6)
; (gcd 6 (rem 40 6))
; (gcd 6 4)
; (gcd 4 (rem 6 4))
; (gcd 4 2)
; (gcd 2 (rem 4 2))
; (gcd 2 0)
; ;4
; 2
