(println "hello world")

(defn hello [name] (println "hello , " name))
(hello "darion")

(defn add [x y] (+ x y))
(println (add 1 2)) 


(def v-int 1024)
(println v-int)


(require '[clojure.string :as str])
(str/blank? "")



(defrecord person [name age])
(println (person. 'darion' , 24))
(println (:name (person. "darion" 24)))

;; List Examples
(list 1 2 3 4) ; define a List
(println (range 4))      ; (0 1 2 3) 
(println (range 1 5))    ; (1 2 3 4)
(println (range 1 5 2))  ; (1 3)

;; Repeat : create a seq
(println (repeat 7 1))   ; (1 1 1 1 1 1 1)

(def numbers `(3 2 1 4 5 6))
(println (first numbers))   ; 3
(println (second numbers))  ; 2

;; Set Examples

