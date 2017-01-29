// src/main/scala/progscala/patternmatching/match_guard.sc

object match_guard {
  for (i <- Seq(1, 2, 3, 4)) {
    i match {
      case _ if (i % 2 == 0) => println(s"par: $i")
      case _ if i % 2 == 1 => println(s"impar: $i") /* no usamos parentesis por for compresionh*/
    }                                             //> impar: 1
                                                  //| par: 2
                                                  //| impar: 3
                                                  //| par: 4
  }

}