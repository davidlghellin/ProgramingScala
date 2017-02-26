// src/main/scala/progscala/fp/datastructs/foreach.sc

object foreach {
  List(1, 2, 3, 4, 5) foreach { i => println("Int: " + i) }
                                                  //> Int: 1
                                                  //| Int: 2
                                                  //| Int: 3
                                                  //| Int: 4
                                                  //| Int: 5
  val stateCapitals = Map(
    "Alabama" -> "Montgomery",
    "Alaska" -> "Juneau",
    "Wyoming" -> "Cheyenne")                      //> stateCapitals  : scala.collection.immutable.Map[String,String] = Map(Alabama
                                                  //|  -> Montgomery, Alaska -> Juneau, Wyoming -> Cheyenne)
  stateCapitals foreach { case (k, v) => println(k + ": " + v) }
                                                  //> Alabama: Montgomery
                                                  //| Alaska: Juneau
                                                  //| Wyoming: Cheyenne
}