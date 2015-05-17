(ns ring-server.core)
(use 'ring.adapter.jetty)

(defn handler 
  [request]
  {:status 200
   :header {"Content-Type" "text/html"}
   :body "Hello World!"})

(defn -main []
  (run-jetty handler {:port 8080}))
