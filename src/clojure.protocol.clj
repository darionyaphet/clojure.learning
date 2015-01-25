(defprotocol AProtocol
             "A doc string for AProtocol abstraction"
             (bar [a b] "bar docs")
             (baz [a] [a b] [a b c] "baz docs")
             )

(ns examples.gulp
    (:import (java.io.FileInputStream InputStreamReader BufferedReader)))


(defn gulp [src]
  (let [stringBuilder (StringBuilder.)]
    (with-open [reader (-> src 
                           FileInputStream.
                           InputStreamReader.
                           BufferedReader.
                           )]
               (loop [c (.read reader)]
                     if (neg? c)
                     (str stringBuilder)
                     (do
                       (.append stringBuilder)
                       (recur (.read reader))
                       )
                     )
    )
  )
)

(println (gulp "/Users/2011204/source/nginx-1.7.7/src/core/nginx.c"))
