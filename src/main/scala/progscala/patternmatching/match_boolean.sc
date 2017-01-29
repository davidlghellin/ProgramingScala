// src/main/scala/progscala/patternmatching/match_boolean.sc

object match_boolean {
  val bools = Seq(true, false)                    //> bools  : Seq[Boolean] = List(true, false)

  for (b <- bools) {
    b match {
      case true  => println("God heads")
      case false => println("God taiils")
    }                                             //> God heads
                                                  //| God taiils
  }

  for (b <- bools) {
    val which = if (b) "head" else "tails"
    println("Got " + which)
  }                                               //> Got head
                                                  //| Got tails
}