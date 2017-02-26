// src/main/scala/progscala/fp/datastructs/seq.sc

object seq {
  val seq1 = Seq("Programming", "Scala")          //> seq1  : Seq[String] = List(Programming, Scala)

  val seq2 = "People" +: "should" +: "read" +: seq1
                                                  //> seq2  : Seq[String] = List(People, should, read, Programming, Scala)
  val seq3 = "Programming" +: "Scala" +: Seq.empty//> seq3  : Seq[String] = List(Programming, Scala)

  val seq4 = "People" +: "should" +: "read" +: Seq.empty
                                                  //> seq4  : Seq[String] = List(People, should, read)
  val seq5 = seq4 ++ seq3                         //> seq5  : Seq[String] = List(People, should, read, Programming, Scala)

 val seq11 = Seq("Programming", "Scala")          //> seq11  : Seq[String] = List(Programming, Scala)
 val seq21 = seq1 :+ "Rocks!"                     //> seq21  : Seq[String] = List(Programming, Scala, Rocks!)
}