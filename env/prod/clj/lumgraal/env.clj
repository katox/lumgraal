(ns lumgraal.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[lumgraal started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[lumgraal has shut down successfully]=-"))
   :middleware identity})
