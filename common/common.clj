(defn defaulted
  [value default]
  (if value value default)
  )

;; (prn (defaulted "hello" "message")) => "hello"
;; (prn (defaulted nil     "message")) => "message" 

(defn sum [values] (reduce + values))
;; (prn (sum [1 2 3 4])) => 10


