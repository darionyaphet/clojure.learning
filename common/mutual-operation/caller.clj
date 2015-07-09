(ns mutual.operation)

(import `(Greeting))

(defn say [] (.say (new Greeting)))

