// src/main/scala/progscala/fp/datastructs/flatmap.sc

object flatmap {
  val list = List("now", "is", "", "the", "time") //> list  : List[String] = List(now, is, "", the, time)

  /*
	ahora devolvemos una coleccion
	*/
  list flatMap (s => s.toList)                    //> res0: List[Char] = List(n, o, w, i, s, t, h, e, t, i, m, e)

  val list2 = List("now", "is", "", "the", "time") map (s => s.toList)
                                                  //> list2  : List[List[Char]] = List(List(n, o, w), List(i, s), List(), List(t, 
                                                  //| h, e), List(t, i, m, e))
  list2.flatten                                   //> res1: List[Char] = List(n, o, w, i, s, t, h, e, t, i, m, e)
}