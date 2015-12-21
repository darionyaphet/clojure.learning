(defrecord Note [pitch octave duration])

(def n (->Note :D# 4 1/2))
(prn (.pitch n))
(prn (:pitch n))
(prn (map? n))

(prn (assoc n :pitch :Db :duration 1/4))
(prn (assoc n :velocity 100))


(prn (dissoc n :pitch)) ;dissoc will return a map ... not record!
