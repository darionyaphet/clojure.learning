(require '[clojure.string :as str])

(println (str/blank? "")) ;;true
(println (clojure.string/capitalize "hello world")) ;; Hello world

(println (clojure.string/upper-case "hello world")) ;; HELLO WORLD
(println (clojure.string/lower-case "HELLO WORLD")) ;; hello world


(println (clojure.string/trim "\thello \n")) ;; hello
(println (str/replace "hello world darion" #"\s+"  "-"))


(println (str "darion" " " "yaphe"))
(def first-name "darion")
(def last-name  "yaphet")
(def age 24)
(println (str last-name " , " first-name "@" age))


(println (seq "hello"))

;;Converting Between Characters and Integers
;;Use the int function to convert a character to its integer value:
(println (int \a)) ;;97
(println (map int "Hello World")) 

;;Use the char function to return a character corresponding to the code point specified
;;by the Integers
(println (char 97)) ;;a

;;Formatting Strings
(def me {:name "darion" , :age "24"})
(println "I'm " (:name me) " ," (:age me) " years old")
