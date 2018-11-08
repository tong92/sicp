# lisp

- define

	(define x 7)

- function

	(define (sqr x) (* x x))

- flowcontrol

	- cond

		(cond ((> x 0) x) (else (- x))) 

	- if

		(if (> x 0) x (- x))

# clojure

- def

	(def x 7)	

- function

	(defn sqr [x] (* x x))

	(fn [x] (* x x))

	#(* % %)

- flowcontrol

	- cond

		(cond (> x 0) x :else (- x))

	- if

		(if (> x 0) x (- x))


# applicative order evalutation

	- 인자 값부터 계산
	
# normal order evaluation

	- 식을 기본 연산까지 펼친 다음 계산
	
