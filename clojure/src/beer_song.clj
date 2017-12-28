(ns beer-song)

(defn verse-case
  [number]
  (case number
    0 (str "No more bottles of beer on the wall, no more bottles of beer.\n"
       "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n")
    1 (str "1 bottle of beer on the wall, 1 bottle of beer.\n"
       "Take it down and pass it around, no more bottles of beer on the wall.\n\n")
    2 (str "2 bottles of beer on the wall, 2 bottles of beer.\n"
       "Take one down and pass it around, 1 bottle of beer on the wall.\n\n")
    (str (str number) " bottles of beer on the wall, " (str number) " bottles of beer.\n"
       "Take one down and pass it around, " (str (- number 1)) " bottles of beer on the wall.\n\n")))

(defn verse-condp
  [number]
  (condp = number
    0 (str "No more bottles of beer on the wall, no more bottles of beer.\n"
       "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n")
    1 (str "1 bottle of beer on the wall, 1 bottle of beer.\n"
       "Take it down and pass it around, no more bottles of beer on the wall.\n\n")
    2 (str "2 bottles of beer on the wall, 2 bottles of beer.\n"
       "Take one down and pass it around, 1 bottle of beer on the wall.\n\n")
    (str (str number) " bottles of beer on the wall, " (str number) " bottles of beer.\n"
       "Take one down and pass it around, " (str (- number 1)) " bottles of beer on the wall.\n\n")))

(defn verse
  [number]
  (verse-condp number))

(defn verses
  [begin end]
  (clojure.string/join (map verse (reverse (range end (+ begin 1) 1)))))

(defn sing
  []
  (verses 99 0))
