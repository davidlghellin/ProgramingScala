// src/main/scala/progscala/fp/recursion/trampoline.sc

object trampoline {
  import scala.util.control.TailCalls._
  
  
  def isEven(xs: List[Int]): TailRec[Boolean] =
    if (xs.isEmpty) done(true) else tailcall(isOdd(xs.tail))
                                                  //> isEven: (xs: List[Int])util.control.TailCalls.TailRec[Boolean]
  def isOdd(xs: List[Int]): TailRec[Boolean] =
    if (xs.isEmpty) done(false) else tailcall(isEven(xs.tail))
                                                  //> isOdd: (xs: List[Int])util.control.TailCalls.TailRec[Boolean]
  for (i <- 1 to 5) {
    val even = isEven((1 to i).toList).result
    println(s"$i is even? $even")
  }                                               //> 1 is even? false
                                                  //| 2 is even? true
                                                  //| 3 is even? false
                                                  //| 4 is even? true
                                                  //| 5 is even? false
}