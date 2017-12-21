module BeerSong exposing (verse, verses, sing)

import List exposing (range, reverse)

verse : Int -> String
verse number =
  let
    current = toString(number)
    previous = toString(number - 1)
  in
    case number of
      0 -> "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall."
      1 -> "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n"
      2 -> "2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n"
      _ -> current ++ " bottles of beer on the wall, " ++ current ++ " bottles of beer.\nTake one down and pass it around, " ++ previous ++ " bottles of beer on the wall.\n"


combineVerses : List Int -> String
combineVerses versesNum =
  case versesNum of
    (x::[]) -> verse x
    (x::xs) -> verse x ++ "\n" ++ combineVerses xs
    [] -> ""


verses : Int -> Int -> String
verses end begin =
  let
    versesNum = reverse <| range begin end
  in
    combineVerses versesNum


sing : String
sing =
  verses 99 0
