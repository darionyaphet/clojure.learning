(defn stack-consuming-fibonacci [n]
     (cond
       (= n 0) 0
       (= n 1) 1
       :else (+ (stack-consuming-fibonacci (- n 1))
                (stack-consuming-fibonacci (- n 2)))))

(println (stack-consuming-fibonacci 9))

(defn tail-fibonacci [n]
  (letfn [
          (fib
            [current next n]
            (if (zero? n)
              current 
              (fib next (+ current next) (dec n))
              )
            )
          ]
         (fib 0N 1N n)
         )
  )

(println (tail-fibonacci 9))
