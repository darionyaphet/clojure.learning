(definterface IOFactory
    (^java.io.bufferedReader make-reader [this])
    (^java.io.buffereWriter  make-writer [this])
)
