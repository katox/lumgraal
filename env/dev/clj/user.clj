(ns user
  (:require [lumgraal.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [lumgraal.core :refer [start-app]]
            [lumgraal.db.core]
            [conman.core :as conman]
            [luminus-migrations.core :as migrations]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start ))

(defn stop []
  (mount/stop))

(defn restart []
  (stop)
  (start))

(defn restart-db []
  (mount/stop #'lumgraal.db.core/*db*)
  (mount/start #'lumgraal.db.core/*db*)
  (binding [*ns* 'lumgraal.db.core]
    (conman/bind-connection lumgraal.db.core/*db* "sql/queries.sql")))

(defn reset-db []
  (migrations/migrate ["reset"] (select-keys env [:database-url])))

(defn migrate []
  (migrations/migrate ["migrate"] (select-keys env [:database-url])))

(defn rollback []
  (migrations/migrate ["rollback"] (select-keys env [:database-url])))

(defn create-migration [name]
  (migrations/create name (select-keys env [:database-url])))


