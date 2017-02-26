// src/main/scala/progscala/fp/datastructs/filter.sc

object filter {
  val stateCapitals = Map(
    "Alabama" -> "Montgomery",
    "Alaska" -> "Juneau",
    "Wyoming" -> "Cheyenne")                      //> stateCapitals  : scala.collection.immutable.Map[String,String] = Map(Alabama
                                                  //|  -> Montgomery, Alaska -> Juneau, Wyoming -> Cheyenne)

  val map2 = stateCapitals filter { mapa => mapa._1 startsWith "A" }
                                                  //> map2  : scala.collection.immutable.Map[String,String] = Map(Alabama -> Montg
                                                  //| omery, Alaska -> Juneau)
  val test = List(1, 2, 3)                        //> test  : List[Int] = List(1, 2, 3)
  test.filterNot((a: Int) => { a == 2 })          //> res0: List[Int] = List(1, 3)

  test.filter((a: Int) => { a != 2 })             //> res1: List[Int] = List(1, 3)
  /*
	Seleciona los elementos a partir del elemento "n", puede devolver vacio
	*/
  stateCapitals.drop(2)                           //> res2: scala.collection.immutable.Map[String,String] = Map(Wyoming -> Cheyenn
                                                  //| e)

  /*
	dropWhile devuelve el listado de elementos que no satisfacen el predicado
	*/
  val test2 = List(1, 2, 3, 5, 99, 0)             //> test2  : List[Int] = List(1, 2, 3, 5, 99, 0)
  /*
	Devuelve la lista a partir de donde no se cumple la condicion, en este caso empieza desde 5
	*/
  test2.dropWhile(a => a != 5)                    //> res3: List[Int] = List(5, 99, 0)
  /*
	Devuelve la lista a partir de donde no se cumple la condicion, en este caso empieza desde el primer elemento que es distinto de 5
	*/
  test2.dropWhile(a => a == 5)                    //> res4: List[Int] = List(1, 2, 3, 5, 99, 0)

  /*
 	Comprueba si existe un elemento, como podemos ver tenemos muchas formas de actuar con el
 	*/
  stateCapitals.exists(_ == ("Alabama", "Montgomery"))
                                                  //> res5: Boolean = true
  stateCapitals.exists(x => x == ("Alabama", "Montgomery"))
                                                  //> res6: Boolean = true
  stateCapitals.exists(_._1 == "Alabama")         //> res7: Boolean = true
  stateCapitals.exists(x => x._1 == "Alabama")    //> res8: Boolean = true
  stateCapitals.exists(x => x._1 == "Alabama" && x._2 == "Montgomery")
                                                  //> res9: Boolean = true
}