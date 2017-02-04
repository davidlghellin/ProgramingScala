// src/main/scala/progscala/fp/datastructs/curried_func2.sc

object curried_func2 {
  val f1: String => String => String =
    (s1: String) => (s2: String) => s1 + s2

  val f2: String => (String => String) =
    (s1: String) => (s2: String) => s1 + s2

  f1("hello")("world")
  f2("hello")("world")

  // tambien podemos descrrificar
  def cat3(s1: String, s2: String) = s1 + s2
  cat3("hello", "world")
  val cat3Curried = (cat3 _).curried
  cat3Curried("hello")("world")

  val cat3Uncurried = Function.uncurried(cat3Curried)
  cat3Uncurried("hello", "world")
  val ff1 = Function.uncurried(f1)
  ff1("hello", "world")

  // podemos definir la multiplicacion
  def multiplier(i: Int)(factor: Int) = i * factor
  // definimos las multiplicaciones
  val byFive = multiplier(5) _
  val byTen = multiplier(10) _

  byFive(2)
  byTen(2)

  // Multiplicaciones de funciones de tres parametros
  def mult(d1: Double, d2: Double, d3: Double) = d1 * d2 * d3
  val d3 = (1,2,3)
  mult(d3._1, d3._2, d3._3)

  val multTupled = Function.tupled(mult _)
  multTupled(d3)
  
  val multUntupled = Function.untupled(multTupled)
  multUntupled(d3._1, d3._2, d3._3)
}