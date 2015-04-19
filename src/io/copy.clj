(ns io
    (:require [clojure.java.io :as io]))


(defn copyLineByLine [source target]
  (with-open [reader (io/reader source)
              writer (io/writer target)]
    (io/copy reader writer)))


(copyLineByLine "resource/data" "resource/target" )
