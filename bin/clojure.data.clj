;;Immutability means that a Clojure data structure, once created, can never change.
;;


;; Creating a List
;;use parentheses in combination with a single quote to indicate that the list
;;should only be read as a data structure
(println `(1 :2 "3"))      ;;(1 :2 3)
(println (list 1 :2 "3"))  ;;(1 :2 3)


;; Creating a List from an Existing Data Structure 
;; sequential data structure --> list 
(println (apply list [1 2 3 4 5])) 
(println (into `() [1 2 3 4 5]))

;; conj is used to add an item or items to a logical collection and is polymorphic
;; meaning it works on multiple concrete data types
(println (conj (list 1 2 3) 4)  )
(println (conj (list 1 2 3) 4 5))

;;Removing the first item from a List
;;is easily accomplished using one of two functions,rest or pop
(println (pop  '(1 2 3)))
(println (rest '(1 2 3)))

;; test if a value is a list
;; The list? function specifically tests if the argument implements clojure.lang.IPersistentList
(println (list? (list 1 2 3)))
(println (seq?  (list 1 2 3)))
(println (list? (cons 1 '(2 3))))
(println (type  (cons 1 '(2 3))))
(println (seq?  (cons 1 '(2 3))))

;; range's lazy return value is a seq, but not a list
(println (list? (range 3)))
(println (seq?  (range 3)))
(println (type  (range 3)))


;; create a vector 
(println [ 1 :2 "3"])
(println (vector 1 :2 "3"))

;;To construct a vector from an existing data structure
(println (vec '(1 :2 "3")))
(println (into [] '(1 :2 "3")))

;; When used on a vector, the conj function returns a vector with one or more items
;; appended to the end:
(println (conj [1 2 3] 4))
(println (conj [1 2 3] 4 5))

;;(:use )
;;  taking the union, intersection,or difference of two sets
;;(println (clojure.set/union #{:red :white} #{:white :blue} #{:blue :green}))


(println (def beans {:red 10 :blue 3 :green 7}))
(println (reduce + (vals (select-keys beans [:red :blue :green]))))
