(ns ^:figwheel-hooks t1.main
  (:require
    [button :as material-button]
    [number-format]
    [goog.dom :as gdom]
    [reagent.core :as reagent]
    ))

(defn ^:after-load render-view []
  (reagent/render-component
    [:<>
     [:h1 "Teste 1"] ;; This works.

     [:> number-format ;; This other react component also works.
      {:suffix "x"
       :decimalScale 3}]

     [:> material-button ;; This one does not work 😓
        {:variant "outlined"}
        "Teste 1"]]

    (gdom/getElement "app")))

(defonce startup
  (render-view))
