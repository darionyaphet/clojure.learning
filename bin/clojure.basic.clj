(println (let [x 1] x))

(println (let [x 1 y 2] (+ x y)))

(def scenes [{:subject  "Frankie" :action   "say"   :object   "relax"}
             {:subject  "Lucy"    :action   "❤s"    :object   "Clojure"}
             {:subject  "Rich"    :action   "tries" :object   "a new conditioner"}
             ])

;; Define a function
(defn people-in-scenes [scenes]
    (->> scenes
         (map :subject)
         (interpose ", ")
         (reduce str)))

;; Who's in our scenes?
(println "People:" (people-in-scenes scenes))


;; define & call funtion
(defn square [x] (* x x))
(println (square 4))



;; for & doseq
(prn "for & doseq")
(println (for [x [:a :b] , y (range 5) :when (odd? y)] [x y] ))
(doseq [x [:a :b] , y (range 5) :when (odd? y)] (prn x y))

;; list
(prn `(1 2 3 4)) 

;; vector
(prn [1 2 3 4])

;; map
(prn {1 'one',2 'two',3 'three'})

;; set
(prn #{1 2 3 4})


(fn mk-set [a b c] #{a b c})
(prn  (mk-set 1 2 3))
