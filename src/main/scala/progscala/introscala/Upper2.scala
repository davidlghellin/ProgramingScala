package progscala.introscala

object Upper2 {
  def main(args: Array[String]) =
  {
    val output = args.map(_.toUpperCase()).mkString(";")//mkString pone el caracter especificado entre las palabras
    println(output)
    val output2 = args.map(_.toUpperCase()).mkString("[",";","]")//mkString pone los caracteres de inicio y fin, más los de dentro 
    println(output2)
  }
}