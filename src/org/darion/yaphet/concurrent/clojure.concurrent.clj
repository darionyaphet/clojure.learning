(def d (delay 
         (println "first message")
         (println "next  message")
         ))

(@d)

