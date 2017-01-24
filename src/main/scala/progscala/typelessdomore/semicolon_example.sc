//src/main/scala/progscala/typelessdomore/semicolon_example.sc

class semicolon{
	//signo igual => mas codigo
	def equalsign(s: String) =
	println("equalsign: " + s)
	// llaves =>mas codigo
	def equalsign2(s: String) = {
	println("equalsign2: " + s)
	}
	// coma, punto y signos => mas codigo
	def commas(s1: String,
	s2: String) = Console.
	println("comma: " + s1 +
	", " + s2)
}

// si ponemos en eclipse object y guardamos en este fichero nos da las salidas
object semicolonObject{
	//signo igual => mas codigo
	def equalsign(s: String) =
	println("equalsign: " + s)                //> equalsign: (s: String)Unit
	// llaves =>mas codigo
	def equalsign2(s: String) = {
	println("equalsign2: " + s)
	}                                         //> equalsign2: (s: String)Unit
	// coma, punto y signos => mas codigo
	def commas(s1: String,
	s2: String) = Console.
	println("comma: " + s1 +
	", " + s2)                                //> commas: (s1: String, s2: String)Unit
}