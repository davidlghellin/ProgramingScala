// src/main/scala/progscala/fp/basics/hofs_closure_example.sc

object hofs_closure_example {
  var factor = 2;

  val multiplicar = (i: Int) => i * factor

  (1 to 10).filter(_ % 2 == 0).map(multiplicar).reduce(_ * _)

  //(1 to 10) filter(_ % 2 == 0) map multiplicar reduce(_ * _)

  factor = 3;
  (1 to 10).filter(_ % 2 == 0).map(multiplicar)
}