// src/main/scala/progscala/fp/datastructs/set.sc

object set {
  val states = Set("Alabama", "Alaska", "Wyoming")//> states  : scala.collection.immutable.Set[String] = Set(Alabama, Alaska, Wyom
                                                  //| ing)
  val lengths = states map (st => st.length)      //> lengths  : scala.collection.immutable.Set[Int] = Set(7, 6)
  
  val states2 = states + "Virginia"               //> states2  : scala.collection.immutable.Set[String] = Set(Alabama, Alaska, Wyo
                                                  //| ming, Virginia)
  val states3 = states2 + ("New York", "Illinois")//> states3  : scala.collection.immutable.Set[String] = Set(Alaska, Virginia, Al
                                                  //| abama, New York, Illinois, Wyoming)

}