(ns io
    (:require [clojure.java.io :as io]))

(defn readLineByLine [file-name] 
  (with-open [reader (io/reader file-name)]
             (doseq [line (line-seq reader)]
                    (println line))))

(readLineByLine "data")
