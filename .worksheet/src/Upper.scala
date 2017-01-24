// src/main/scala/progscala/introscala/upper2.sc

object Upper {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(122); 
	def upper(string: String*) = string.map(_.toUpperCase());System.out.println("""upper: (string: String*)Seq[String]""")}
}

println(Upper.upper("Hello", "World!"))


// vemaos los ahora, que Upper esta definida como "object" = singleton
// como vemos en la definicion de la funcion tenemos que definir los parametros de entrada
// ya que scala no puede inferir pero si los de salida
