(require '[clojure.java.io :as io])
(import '[java.net.ServerSocket])

(defn receive [socket]
  (.readline (io/reader socket))
)

(defn send [socket message]
  (let [writer (io/writer socket)]
    (.writer writer message)
    (.flush writer))
)


(defn service [handler]
  (with-open [server-sock (ServerSocket. port)
              socket (.accept server-sock)]
    (let [message-in (receive socket) message-out (handler message-in)]
      (send socket message-out))))
