// src/main/scala/progscala/fp/basics/hofs_closure3_example.sc

object hofs_closure3_example {

  object Multipl {
    var factor = 2
    // comparamos con: val mult= ( i:Int)=>i*factor
    def mult(i: Int) = i * factor
  }

  (1 to 10).filter(_ % 2 == 0).map(Multipl.mult).reduce(_ * _)
                                                  //> res0: Int = 122880

}