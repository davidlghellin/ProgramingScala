// src/main/scala/progscala/rounding/TryCatch.scala
package progscala.rounding

object TryCatch {
  def main(args: Array[String]) = {
    args foreach (arg => contarLineas(arg))
  }

  import scala.io.Source
  import scala.util.control.NonFatal

  def contarLineas(fileName: String) = {
    println() 
    var source: Option[Source] = None
    try {
      source = Some(Source.fromFile(fileName))
      val size = source.get.getLines.size
      println(s"el fichero $fileName tiene $size lineas")
    } catch {
      case NonFatal(ex) => println(s"Non fatal exception! $ex")
    } finally {
      for (s <- source) {
        println(s"Cerrando $fileName...")
        s.close
      }
    }
  }
}

/*
> run-main progscala.rounding.TryCatch foo/bar
[info] Running progscala.rounding.TryCatch foo/bar

Non fatal exception! java.io.FileNotFoundException: foo/bar (No existe el fichero o el directorio)

> run-main progscala.rounding.TryCatch src/main/scala/progscala/rounding/TryCatch.scala
[info] Running progscala.rounding.TryCatch src/main/scala/progscala/rounding/TryCatch.scala
el fichero src/main/scala/progscala/rounding/TryCatch.scala tiene 28 lineas

Cerrando src/main/scala/progscala/rounding/TryCatch.scala...
*/