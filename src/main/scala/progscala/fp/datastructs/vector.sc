// src/main/scala/progscala/fp/datastructs/vector.sc

object vector {
  val vect1 = Vector("Programming", "Scala")      //> vect1  : scala.collection.immutable.Vector[String] = Vector(Programming, Sca
                                                  //| la)
  val vect2 = "People" +: "should" +: "read" +: vect1
                                                  //> vect2  : scala.collection.immutable.Vector[String] = Vector(People, should, 
                                                  //| read, Programming, Scala)
  val vect3 = "Programming" +: "Scala" +: Vector.empty
                                                  //> vect3  : scala.collection.immutable.Vector[String] = Vector(Programming, Sca
                                                  //| la)
  val vect4 = "People" +: "should" +: "read" +: Vector.empty
                                                  //> vect4  : scala.collection.immutable.Vector[String] = Vector(People, should, 
                                                  //| read)
  val vect5 = vect4 ++ vect3                      //> vect5  : scala.collection.immutable.Vector[String] = Vector(People, should, 
                                                  //| read, Programming, Scala)
  vect5(3)                                        //> res0: String = Programming
}