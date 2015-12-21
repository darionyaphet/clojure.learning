(ns korma.core)

(use 'korma.db)
(require '[clojure.string :as str])

(defdb create-sqlite3 (sqlite3 {:db "data/sqlite3.db"}))

(defn -main
  "I don't do a whole lot." []
  (create-sqlite3))
