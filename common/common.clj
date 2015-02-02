(defn defaulted
  [value default]
  (if value value default)
  )

;; (prn (defaulted "hello" "message")) => "hello"
;; (prn (defaulted nil     "message")) => "message" 

(defn sum [values] (reduce + values))
;; (prn (sum [1 2 3 4])) => 10


(defn index-seq 
  "Return lazy sequence of [index item]"
  [s]
  (map vector (iterate inc 0) s)
  )
