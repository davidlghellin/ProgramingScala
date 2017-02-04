// src/main/scala/progscala/fp/datastructs/curried_func.sc

object curried_func {

  def cat1(s1: String)(s2: String) = s1 + s2      //> cat1: (s1: String)(s2: String)String

  val hello = cat1("Hello ") _                    //> hello  : String => String = <function1>

  hello("World!")                                 //> res0: String = Hello World!

  cat1("Hello ")("World!")                        //> res1: String = Hello World!

  val inverse: PartialFunction[Double, Double] = {
    case d if d != 0.0 => 1.0 / d
  }                                               //> inverse  : PartialFunction[Double,Double] = <function1>

  inverse(1.0)                                    //> res2: Double = 1.0

  inverse(2.0)                                    //> res3: Double = 0.5

  // inverse(0.0)

  // Curry primera aproximacion
  // transfoma una secuencia de argumentos de funcion a muchas funciones de un argumento
  def cat2(s1: String) = (s2: String) => s1 + s2  //> cat2: (s1: String)String => String
  val cat2hello = cat2("Hello ")                  //> cat2hello  : String => String = <function1>
  cat2hello("World!")                             //> res4: String = Hello World!

  cat1("foo")("bar")                              //> res5: String = foobar
  cat2("foo")("bar")                              //> res6: String = foobar

  def cat3(s1: String, s2: String) = s1 + s2      //> cat3: (s1: String, s2: String)String
  cat3("hello", "world")                          //> res7: String = helloworld
  val cat3Curried = (cat3 _).curried              //> cat3Curried  : String => (String => String) = <function1>
  cat3Curried("hello")("world")                   //> res8: String = helloworld
}