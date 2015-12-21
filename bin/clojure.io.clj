;; the print and println functions will print content passed to them to STDOUT
(println "print message --> STDOUT")

(do
  (println "first line")
  (println "next  line")
)

;; Change the binding of *out* to *err* to print to STDERR instead of STDOUT
(binding [*out* *err*] (println "Redirection out to err"))


;; Create a writer --> file
(def writer (clojure.java.io/writer "/tmp/file.out"))
(binding [*out* writer] (println "writer --> file"))

;; Closing writer
(.close writer)

;; 
(require '[clojure.java.io :as io]
         '[clojure.edn :as edn])

;(->> "people.edn" 
;     io/resource
;     slurp
;     edn/read-string
;     (map :language))

(io/copy (io/file "/tmp/file.out") (io/file "/tmp/file.copy"))

;; Delete a file
(io/delete-file "/tmp/file.copy")

(try
  (io/delete-file "/tmp/file.other")
  (catch Exception e (println "exception : " (.getMessage e)))
)


;; access the files inside 
(def list-dir (file-seq (io/file "/Users/2011204/source/disruptor/src/main/java/com/lmax/disruptor/dsl")))
(println list-dir)

(defn only-files [files] (filter #(.isFile %) files))
(println (only-files list-dir))


;; use a temporary file on the local filesystem.


(import '[java.io RandomAccessFile])

;; read a property file and access its key/value pairs
(require '[clojure.java.io :refer (reader)])
(def props (java.util.Properties.))
(.load props (reader "resources/fruitcolors.properties"))
(println props)

;; read or write some binary data
;; BufferedInputStream, BufferedOutputStream, and ByteBuffer classes to work directly with binary data
;; Clojure’s output-stream wraps the BufferedOutputStream Java object.
;; BufferedOutputStream has a write method that accepts Java byte arrays
(require '[clojure.java.io :refer [file output-stream input-stream]])
(with-open [out (output-stream (file "/tmp/zeros"))] 
           (.write out (byte-array (* 1024 1024) ))
)
(with-open [in (input-stream (file "/tmp/zeros"))]
           (let [buffer (byte-array 1024)
                 n (.read in buffer)]
             (println "Read " n " bytes")
             )
)


