// src/main/scala/progscala/patternmatching/match_tuple.sc

object match_tuple {
  val langs = Seq(
    ("Scala", "Martin", "Odersky"),
    ("Clojure", "Rich", "Hickey"),
    ("Lisp", "John", "McCarthy"))                 //> langs  : Seq[(String, String, String)] = List((Scala,Martin,Odersky), (Cloju
                                                  //| re,Rich,Hickey), (Lisp,John,McCarthy))

  for (tupla <- langs) {
    tupla match {
      case ("Scala", _, _)         => println("Encontrado Scala")
      case (lang, primero, ultimo) => println(s"Encontrado otro leng: $lang ($primero,$ultimo)")
    }                                             //> Encontrado Scala
                                                  //| Encontrado otro leng: Clojure (Rich,Hickey)
                                                  //| Encontrado otro leng: Lisp (John,McCarthy)
  }
}