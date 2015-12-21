(deftype person [first-name last-name age])

(def me (->person "darion" "yaphet" 24))
(prn (.first-name me))
(prn (.last-name  me))
(prn (.age        me))



