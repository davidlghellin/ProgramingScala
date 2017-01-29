// src/main/scala/progscala/patternmatching/match_surprise_fix.sc

object match_surprise {
  def checkY2(y: Int): Unit = {
    for {
      x <- Seq(99, 100, 101)
    } {
      val str = x match {
        case `y`    => "found y!"
        case i: Int => "int: " + i
      }
      println(str)
    }
  }                                               //> checkY2: (y: Int)Unit
  checkY2(100)                                    //> int: 99
                                                  //| found y!
                                                  //| int: 101
}