// src/main/scala/progscala/fp/datastructs/list.sc

object list {
  /*
	Creamos una lista con dos elementos
	*/
  val list1 = List("Programming", "Scala")        //> list1  : List[String] = List(Programming, Scala)

  /*
	Usamos la lista anterior y anyadimos mas elementos
	Usamos '::' para concatenar elementos
	*/
  val list2 = "People" :: "should" :: "read" :: list1
                                                  //> list2  : List[String] = List(People, should, read, Programming, Scala)

  /*
	Creamos una lista anyadiendo elementos a partir de una lista vacia
	*/
  val list3 = "Programming" :: "Scala" :: Nil     //> list3  : List[String] = List(Programming, Scala)
  val list4 = "People" :: "should" :: "read" :: Nil
                                                  //> list4  : List[String] = List(People, should, read)
 
 	/*
 	Podemos concatenar dos listas con '++'
 	*/
  val list5 = list4 ++ list3                      //> list5  : List[String] = List(People, should, read, Programming, Scala)
}