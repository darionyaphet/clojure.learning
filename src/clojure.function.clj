;; map function
(defn foo [a b c] (* a b c))
(prn (foo 1 2 3))

(prn (map inc [1 2 3 4]))

;; map can be used with multiple collections
;; Collections will be consumed and passed to the mapping function in parallel
(prn (map + [1 2 3] [4 5 6] [7 8 9]))

(prn (map #(str "Hello " % "!" ) ["Ford" "Arthur" "Tricia"]))

;; (map vector [:a :b :c] [:d :e :f] [:g :h :i])
(prn (apply map vector [
                        [:a :b :c]
                        [:d :e :f]
                        [:g :h :i]
                        ]))


;; merge function
;; Returns a map that consists of the rest of the maps conj-ed onto the first
(prn (merge {:a 1 :b 2 :c 3} {:b 9 :d 4})) 
(prn (merge-with + 
                 {:a 1}
                 {:a 1 :b 1}
                 {:a 1 :b 1 :c 1}
                 {:a 1 :b 1 :c 1 :d 1}
                 {:a 1 :b 1 :c 1 :d 1 :e 1}
                 ))

;; range return a lazy seq 
(prn (take 5 (range)))
(prn (take 7 (range)))

;; 0 -- end
(prn (range 5))

;; start -- end
(prn (range 5 8))
(prn (range 7 5))

;; start -- end -- step
(prn (range 1 20 2))

(def seqs (iterate inc 1))
(prn (take 10 seqs))

(prn (keep inc [1 2 3]))

(prn (distinct [1 2 3 2 1]))

;; filter 
(prn (filter even? (range 10)))
(prn (filter  odd? (range 10)))
(prn (filter #(> % 3) (range 10)))

;; sort
;; (sort coll)
;; (sort comparator coll)
(prn (sort [4 2 3 1]))
(prn (sort > [4 2 3 1]))
(prn (sort >= [4 2 3 1]))
(prn (sort < [4 2 3 1]))
(prn (sort <= [4 2 3 1]))

;; shuffle
(prn (shuffle [3 5 2]))
(prn (shuffle [3 5 2]))
(prn (shuffle [3 5 2]))

(prn (reverse [1 2 3 4]))


;;
(defstruct car-struct :make :model :year :color)
(def car (struct car-struct "Toyota" "Prius" 2010))
(def make (accessor car-struct :make))
(prn (make car))


;; concat
;; Returns a lazy seq representing the concatenation of the elements in the supplied colls
(prn (concat [1] [2 3] [4 5 6]))
(prn (into [] (concat [1 2] [3 4])))
(prn (concat [:a :b] nil [1 [2 3] 4]))



