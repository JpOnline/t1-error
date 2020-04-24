(ns ^:figwheel-hooks t1.main
  (:require
    [Button :as material-button]
    [number-format]
    [goog.dom :as gdom]
    [reagent.dom :as reagent-dom]
    ))

(defn ^:after-load render-view []
  (reagent-dom/render
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
