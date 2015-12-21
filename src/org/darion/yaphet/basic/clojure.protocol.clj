(defprotocol AProtocol
             "A doc string for AProtocol abstraction"
             (bar [a b] "bar docs")
             (baz [a] [a b] [a b c] "baz docs")
             )
