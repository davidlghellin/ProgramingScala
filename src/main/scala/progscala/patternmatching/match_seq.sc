// src/main/scala/progscala/patternmatching/match_seq.sc

object match_seq {

  val noVacioSeq = Seq(1, 2, 3, 4)                //> noVacioSeq  : Seq[Int] = List(1, 2, 3, 4)
  val vacioSeq = Seq.empty[Int]                   //> vacioSeq  : Seq[Int] = List()
  val noVacioList = List(1, 2, 3, 4)              //> noVacioList  : List[Int] = List(1, 2, 3, 4)
  val vacioList = Nil                             //> vacioList  : scala.collection.immutable.Nil.type = List()
  val noVacioVector = Vector(1, 2, 3, 4)          //> noVacioVector  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4)
                                                  //| 
  val vacioVector = Vector.empty[Int]             //> vacioVector  : scala.collection.immutable.Vector[Int] = Vector()
  val noVacioMapa = Map("uno" -> 1, "dos" -> 2)   //> noVacioMapa  : scala.collection.immutable.Map[String,Int] = Map(uno -> 1, do
                                                  //| s -> 2)
  val vacioMapa = Map.empty[String, Int]          //> vacioMapa  : scala.collection.immutable.Map[String,Int] = Map()

  def seqToString[T](seq: Seq[T]): String = seq match {
    case head +: tail => s"$head +: " + seqToString(tail)
    case Nil          => "Nil"
  }                                               //> seqToString: [T](seq: Seq[T])String

  for (seq <- Seq(noVacioSeq, vacioSeq, noVacioList, vacioList, noVacioVector, vacioVector, noVacioMapa.toSeq, vacioMapa.toSeq)) {
    println(seqToString(seq))                     //> 1 +: 2 +: 3 +: 4 +: Nil
                                                  //| Nil
                                                  //| 1 +: 2 +: 3 +: 4 +: Nil
                                                  //| Nil
                                                  //| 1 +: 2 +: 3 +: 4 +: Nil
                                                  //| Nil
                                                  //| (uno,1) +: (dos,2) +: Nil
                                                  //| Nil
  }

}