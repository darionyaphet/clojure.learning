;; List Examples
(list 1 2 3 4) ; define a List
(println (range 4))      ; (0 1 2 3) 
(println (range 1 5))    ; (1 2 3 4)
(println (range 1 5 2))  ; (1 3)


(println (list [1 2 3 4 5]))
(println (into (sorted-map) [[:a 1] [:c 3] [:b 2]]))
(println (into [] {1 2,3 4}))

;; Repeat : create a seq
(println (repeat 7 1))   ; (1 1 1 1 1 1 1)

(def numbers `(3 2 1 4 5 6))
(println (first numbers))   ; 3
(println (second numbers))  ; 2

;; Set Examples


;; Returns a new hash map with supplied mappings.
;; hash map
(prn (hash-map))
(prn {})
(prn (hash-map :key1 'val1,:key2 'val2))
(prn (apply hash-map (.split "a 1 b 2 c 3" " ")))

;;a hash map can be stored in a var by using `def`
(prn (def person {:first-nam "darion" , :last-name "yaphet"}))


;; key function
(prn (map key {:a 1,:b 2}))

;; aclone
;; clone Java Array (know type) 
(def array (int-array [1 2 3 4 5]))
(def another (aclone array))
(prn another)
