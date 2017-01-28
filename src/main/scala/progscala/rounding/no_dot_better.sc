// src/main/scala/progscala/rounding/no_dot_better.sc

object no_dot_better {
  def esPar(n: Int): Boolean = (n % 2) == 0       //> esPar: (n: Int)Boolean

	/* notacion simplificada */
  List(1, 2, 3, 4, 5) filter esPar foreach println//> 2
                                                  //| 4

  List(1, 2, 3, 4).filter((i: Int) => esPar(i)).foreach((i: Int) => println(i))
                                                  //> 2
                                                  //| 4

  List(1, 2, 3, 4).filter(i => esPar(i)).foreach(i => println(i))
                                                  //> 2
                                                  //| 4
  
  /* tomamos la lista, le aplicamos el filtro con la funcion que nos da par,
  y a ellos le aplicamos un foreach con la funcion de imprimir */
  List(1, 2, 3, 4).filter(esPar).foreach(println) //> 2
                                                  //| 4
  
  List(1, 2, 3, 4) filter esPar foreach println   //> 2
                                                  //| 4
}