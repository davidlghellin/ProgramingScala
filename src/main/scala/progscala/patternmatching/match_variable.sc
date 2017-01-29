// src/main/scala/progscala/patternmatching/match_variable.sc

object match_variable {

  for{
    x <- Seq(1, 2, 2.7, "one", "two", 'four) //Seq[Any]
  }{
    val str = x match {
      case 1          => "entero 1"
      case i: Int     => "otro int: " + i
      case d: Double  => "a double: " + x
      case "one"      => "string one"
      case s: String  => "other string: " + s
      case unexpected => "unexpected value: " + unexpected
    }
    println(str)
  }                                               //> entero 1
                                                  //| otro int: 2
                                                  //| a double: 2.7
                                                  //| string one
                                                  //| other string: two
                                                  //| unexpected value: 'four
}