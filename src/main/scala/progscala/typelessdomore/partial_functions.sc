//src/main/scala/progscala/typelessdomore/partial_functions.sc


class Partial_function {
  
  // funcion parcial
  // input lo que sea, output String
  // cuerpo: en caso de ser string "YES"
  val fp1: PartialFunction[Any,String] = {case s: String => "YES"}
  
  // identica pero con Double
  val fp2: PartialFunction[Any,String] = {case s: Double => "YES"}
  
  // combinamos las dos funciones
  val fp = fp1 orElse fp2
  
  // funcion para intentar capturar el error
  def tryPF(x: Any, f: PartialFunction[Any,String]): String = {
		try { f(x).toString }
		catch { case _: MatchError => "ERROR!" }
  }
  
  // funcion de ayuda, para intentar isDefinedAt
  def d(x: Any, f: PartialFunction[Any,String]) =
  {
		f.isDefinedAt(x).toString
	}
	
	def print():Unit={
		println("      |pf1    - String | pf2   - Double | pf    - All")
		println("x     | def?  | pf1(x) | def?  | pf2(x) | def?  | pf(x)")
		println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
		
		List("str", 3.14, 10) foreach { x =>
			printf("%-5s | %-5s | %-6s | %-5s | %-6s | %-5s | %-6s\n", x.toString,
			d(x,fp1), tryPF(x,fp1), d(x,fp2), tryPF(x,fp2), d(x,fp), tryPF(x,fp))
	}
	}
}


val pf = new Partial_function
pf.print

// scalac -Xscript parcial src/main/scala/progscala/typelessdomore/partial_functions.sc
// scala parcial
/*
$ scalac -Xscript parcial src/main/scala/progscala/typelessdomore/partial_functions.sc
$ scala parcial
      |pf1    - String | pf2   - Double | pf    -  All
x     | def?  | pf1(x) | def?  | pf2(x) | def?  | pf(x)
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
str   | true  | YES    | false | ERROR! | true  | YES
3.14  | false | ERROR! | true  | YES    | true  | YES
10    | false | ERROR! | false | ERROR! | false | ERROR!

*/