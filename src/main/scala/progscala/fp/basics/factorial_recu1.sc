// src/main/scala/progscala/fp/basics/factorial_recu1.sc
import scala.annotation.tailrec

object factorial_recu1 {

  def factorial(i: BigInt): BigInt = {
    if (i == 1) i
    else i * factorial(i - 1)
  }                                               //> factorial: (i: BigInt)BigInt
  for (i <- 1 to 10)
    println(s"$i:\t${factorial(i)}")              //> 1:	1
                                                  //| 2:	2
                                                  //| 3:	6
                                                  //| 4:	24
                                                  //| 5:	120
                                                  //| 6:	720
                                                  //| 7:	5040
                                                  //| 8:	40320
                                                  //| 9:	362880
                                                  //| 10:	3628800
    
    println(s"10000:\t${factorial(10000)}")       //> java.lang.StackOverflowError
                                                  //| 	at scala.math.BigInt$.apply(BigInt.scala:49)
                                                  //| 	at scala.math.BigInt$.long2bigInt(BigInt.scala:101)
                                                  //| 	at scala.math.BigInt.isValidLong(BigInt.scala:131)
                                                  //| 	at scala.math.BigInt.equals(BigInt.scala:125)
                                                  //| 	at scala.runtime.BoxesRunTime.equalsNumNum(BoxesRunTime.java:168)
                                                  //| 	at scala.runtime.BoxesRunTime.equalsNumObject(BoxesRunTime.java:140)
                                                  //| 	at factorial_recu1$$anonfun$main$1.factorial_recu1$$anonfun$$factorial$1
                                                  //| (factorial_recu1.scala:7)
                                                  //| 	at factorial_recu1$$anonfun$main$1.factorial_recu1$$anonfun$$factorial$1
                                                  //| (factorial_recu1.scala:8)
                                                  //| 	at factorial_recu1$$anonfun$main$1.factorial_recu1$$anonfun$$factorial$1
                                                  //| (factorial_recu1.scala:8)
                                                  //| 	at factorial_recu1$$anonfun$main$1.factorial_recu1$$anonfun$$factorial$1
                                                  //| (factorial_recu1.scala:8)
                                                  //| 	at factorial_recu1$$anonfun$main$1.factorial_recu1$$anonfun$$factorial$1
                                                  //| (factorial_recu1.scala:8)
                                                  //| 	at factorial_recu1$$anonfun$main$1.factorial_recu1$$anonfun$$fa
                                                  //| Output exceeds cutoff limit.

}