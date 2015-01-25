;;(defmacro name doc-string? attr-map? ([params*] body) + attr-map?)

;;Like defn, but the resulting function name is declared as a
;;macro and will be used as a macro by the compiler when it is
;;called.


(defmacro unless [pred a b]
  `(if (not ~pred) ~a ~b)
  )

(unless false (prn "will print") (prn "will not print"))

;(defmacro with-tree [tree & body]
; 
; )
