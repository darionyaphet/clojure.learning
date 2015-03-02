(defn recur-fibo [number]
  (letfn [(fib [current next number]
               (if (zero? number)
               current
               (recur next (+ current next) (dec number))))]
         (fib 0 1 number)))

; (prn (recur-fibo 10))

(def factorial
     (fn [number]
         (loop [cnt number acc 1]
               (if (zero? cnt) 
                 acc (recur (dec cnt) (* acc cnt))))))

(prn (factorial 10))
