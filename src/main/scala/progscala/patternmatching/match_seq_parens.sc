// src/main/scala/progscala/patternmatching/match_seq_parens.sc

object match_seq_parens {

  val nonEmptySeq = Seq(1, 2, 3, 4, 5)            //> nonEmptySeq  : Seq[Int] = List(1, 2, 3, 4, 5)
  val emptySeq = Seq.empty[Int]                   //> emptySeq  : Seq[Int] = List()
  val nonEmptyMap = Map("one" -> 1, "two" -> 2, "three" -> 3)
                                                  //> nonEmptyMap  : scala.collection.immutable.Map[String,Int] = Map(one -> 1, tw
                                                  //| o -> 2, three -> 3)
  def seqToString2[T](seq: Seq[T]): String = seq match {
    case head +: tail => s"($head +: ${seqToString2(tail)})"
    case Nil          => "(Nil)"
  }                                               //> seqToString2: [T](seq: Seq[T])String

  for (seq <- Seq(nonEmptySeq, emptySeq, nonEmptyMap.toSeq)) {
    println(seqToString2(seq))                    //> (1 +: (2 +: (3 +: (4 +: (5 +: (Nil))))))
                                                  //| (Nil)
                                                  //| ((one,1) +: ((two,2) +: ((three,3) +: (Nil))))
  }
}