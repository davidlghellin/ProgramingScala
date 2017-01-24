// src/main/scala/progscala/introscala/upper1.sc

// OJO con el tipo de sangrar, al menos en las clases

// definicion de clase
class Upper {

	// definicion de metodo, que le pasaremos
	// dentro del parentesis indicamos que sera una lista de String no definida, se pasaran separados por coma
	// por ultimo tenemos lo que devuelve que es un Seq de String y por fin "=" para representar el cuerpo de la funcion
  def upper(strings: String*): Seq[String] =
  {
  	// cuerpo de la funcion donde tenemos que para cada elemento le aplicaremos la mayuscula
  	// usamos lambda
    strings.map((s:String) => s.toUpperCase())
    // en scala el ultimo valor es el que devolvemos
  }
  
}

// declaracion como variable inmutable "val" = final en Java
val up = new Upper
println(up.upper("Hello", "World!"))




//podemos crear un ejecutable del script
//scalac -Xscript Upper1 src/main/scala/progscala/introscala/upper1.sc
// Ojo con la ruta, creará los .class
// para ejecutarlo: scala Upper1


/**

~/workspaceScala/ProgramingScala$ javap -cp . Upper1
Compiled from "upper1.sc"
public final class Upper1 {
  public static void main(java.lang.String[]);
}

workspaceScala/ProgramingScala$ scalap -cp . Upper1
cat: /release: No existe el fichero o el directorio
object Upper1 extends scala.AnyRef {
  def this() = { /* compiled code */ }
  def main(args: scala.Array[scala.Predef.String]): scala.Unit = { /* compiled code */ }
}

**/