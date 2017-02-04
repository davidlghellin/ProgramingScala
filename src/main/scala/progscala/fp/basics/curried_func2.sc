// src/main/scala/progscala/fp/datastructs/curried_func2.sc

object curried_func2 {
  val f1: String => String => String =
    (s1: String) => (s2: String) => s1 + s2       //> f1  : String => (String => String) = <function1>

  val f2: String => (String => String) =
    (s1: String) => (s2: String) => s1 + s2       //> f2  : String => (String => String) = <function1>

  f1("hello")("world")                            //> res0: String = helloworld
  f2("hello")("world")                            //> res1: String = helloworld

  // tambien podemos descrrificar
  def cat3(s1: String, s2: String) = s1 + s2      //> cat3: (s1: String, s2: String)String
  cat3("hello", "world")                          //> res2: String = helloworld
  val cat3Curried = (cat3 _).curried              //> cat3Curried  : String => (String => String) = <function1>
  cat3Curried("hello")("world")                   //> res3: String = helloworld

  val cat3Uncurried = Function.uncurried(cat3Curried)
                                                  //> cat3Uncurried  : (String, String) => String = <function2>
  cat3Uncurried("hello", "world")                 //> res4: String = helloworld
  val ff1 = Function.uncurried(f1)                //> ff1  : (String, String) => String = <function2>
  ff1("hello", "world")                           //> res5: String = helloworld

  // podemos definir la multiplicacion
  def multiplier(i: Int)(factor: Int) = i * factor//> multiplier: (i: Int)(factor: Int)Int
  // definimos las multiplicaciones
  val byFive = multiplier(5) _                    //> byFive  : Int => Int = <function1>
  val byTen = multiplier(10) _                    //> byTen  : Int => Int = <function1>

  byFive(2)                                       //> res6: Int = 10
  byTen(2)                                        //> res7: Int = 20

  // Multiplicaciones de funciones de tres parametros
  def mult(d1: Double, d2: Double, d3: Double) = d1 * d2 * d3
                                                  //> mult: (d1: Double, d2: Double, d3: Double)Double
  val d3 = (2.2, 3.3, 4.4)                        //> d3  : (Double, Double, Double) = (2.2,3.3,4.4)
  mult(d3._1, d3._2, d3._3)                       //> res8: Double = 31.944000000000003

  val multTupled = Function.tupled(mult _)        //> multTupled  : ((Double, Double, Double)) => Double = <function1>
  multTupled(d3)                                  //> res9: Double = 31.944000000000003
  
  val multUntupled = Function.untupled(multTupled)//> multUntupled  : (Double, Double, Double) => Double = <function3>
  multUntupled(d3._1, d3._2, d3._3)               //> res10: Double = 31.944000000000003
}