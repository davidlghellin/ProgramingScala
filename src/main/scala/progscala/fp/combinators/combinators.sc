// src/main/scala/progscala/fp/combinators/combinators.sc

object combinators {
  def map[A, B](list: List[A])(f: (A) ⇒ B): List[B] = list map f
                                                  //> map: [A, B](list: List[A])(f: A => B)List[B]

  val intToString = (i: Int) => s"N=$i"           //> intToString  : Int => String = <function1>

}
/*
scala> object Combinators {
     | def map[A,B](f: (A) ⇒ B)(list: List[A]): List[B] = list map f
     | }
defined object Combinators

scala> val intToString = (i:Int) => s"N=$i"
intToString: Int => String = $$Lambda$1907/103068963@50b46e24

scala> val flist = Combinators.map(intToString) _
flist: List[Int] => List[String] = $$Lambda$1919/5557427@9b2dc56

scala> val list = flist(List(1,2,3,4))
list: List[String] = List(N=1, N=2, N=3, N=4)

*/