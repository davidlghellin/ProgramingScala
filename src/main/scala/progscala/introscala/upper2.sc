// src/main/scala/progscala/introscala/upper2.sc

object Upper {
	def upper(string: String*) = string.map(_.toUpperCase())
}

println(Upper.upper("Hello", "World!"))


// vemaos los ahora, que Upper esta definida como "object" = singleton
// como vemos en la definicion de la funcion tenemos que definir los parametros de entrada
// ya que scala no puede inferir pero si los de salida