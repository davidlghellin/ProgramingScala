// src/main/scala/progscala2/typelessdomore/abstract_types.sc

import java.io._

abstract class BulkReader {
  type in
  val source: in
  def read: String //read codigo y devuelve String
}

class StringBulkReader(val source: String) extends BulkReader {
  type in
  def read: String = source
}

class FileBulkReader(val source: File) extends BulkReader {
  type in = File
  def read: String = {
    val in = new BufferedInputStream(new FileInputStream(source))
    val numBytes = in.available()
    val bytes = new Array[Byte](numBytes)
    in.read(bytes, 0, numBytes)
    new String(bytes)
  }
}

//println(new StringBulkReader("Hola Scala").read)

//println(new FileBulkReader(new File("TypelessDoMore/abstract_types.sc")).read)

///////////////////////////////////////////////////////////////////
/* Podemos observar que ahora hemos parametrizado */
abstract class BulkReader2[In] {
	val source: In
  def read: String //read codigo y devuelve String
}

class StringBulkReader2(val source: String) extends BulkReader2[String] {
	def read: String = source
}

class FileBulkReader2(val source: File) extends BulkReader2[File] {
	def read: String = {
    val in = new BufferedInputStream(new FileInputStream(source))
    val numBytes = in.available()
    val bytes = new Array[Byte](numBytes)
    in.read(bytes, 0, numBytes)
    new String(bytes)
  }
}