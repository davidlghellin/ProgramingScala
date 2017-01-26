//src/main/scala/progscala/typelessdomore/factorial.sc
import scala.annotation.tailrec

object factorial {
  /* funcion factorial que tiene una funcion de ayuda en el interior*/
  def factorial(i: Int): Long = {
    /* podemos ver que tenemos dos parametros uno sera el valor acumulado
		y el otro el que iremos usando para la ir decrementando */
    /* usamos la reccursividad a el mismo */
    def fac(i: Int, acumulado: Int): Long = {
      if (i <= 1) acumulado
      else fac(i - 1, i * acumulado)
    }
    fac(i, 1) /* usamos la semilla 1 */
  }                                               //> factorial: (i: Int)Long

  def factorialTailRec(i: Int): Long = {
    @tailrec	/* optimizacion y comprobar que lo hara correcto y no hay dessbordamieto de pila */
    def fac(i: Int, acumulado: Int): Long = {
      if (i <= 1) acumulado
      else fac(i - 1, i * acumulado)
    }
    fac(i, 1)
  }                                               //> factorialTailRec: (i: Int)Long

  (0 to 5) foreach (i => println(factorial(i)))   //> 1
                                                  //| 1
                                                  //| 2
                                                  //| 6
                                                  //| 24
                                                  //| 120
  (0 to 5) foreach (i => println(factorialTailRec(i)))
                                                  //> 1
                                                  //| 1
                                                  //| 2
                                                  //| 6
                                                  //| 24
                                                  //| 120
}