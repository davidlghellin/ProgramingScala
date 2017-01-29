// src/main/scala/progscala/patternmatching/match_surprise.sc

object match_surprise {
  def checkY(y: Int): Unit = {
    for {
      x <- Seq(99, 100, 101)
    } {
      val str = x match {
        case y      => "found y!"
        case i: Int => "int: " + i
      }
      println(str)
    }
  }                                               //> checkY: (y: Int)Unit
  checkY(100)                                     //> found y!
                                                  //| found y!
                                                  //| found y!
}