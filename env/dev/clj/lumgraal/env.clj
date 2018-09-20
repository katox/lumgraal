(ns lumgraal.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [lumgraal.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[lumgraal started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[lumgraal has shut down successfully]=-"))
   :middleware wrap-dev})
