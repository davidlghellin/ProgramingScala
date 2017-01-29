// src/main/scala/progscala/patternmatching/match_deep.sc

object match_deep {

  val alice = Persona("Alice", 25, Direccion("1 Scala Lane", "Chicago", "USA"))
                                                  //> alice  : Persona = Persona(Alice,25,Direccion(1 Scala Lane,Chicago,USA))
  val bob = Persona("Bob", 29, Direccion("2 Java Ave", "Miami", "USA"))
                                                  //> bob  : Persona = Persona(Bob,29,Direccion(2 Java Ave,Miami,USA))
  val charlie = Persona("Charlie", 32, Direccion("3 Python Ct.", "Boston", "USA"))
                                                  //> charlie  : Persona = Persona(Charlie,32,Direccion(3 Python Ct.,Boston,USA))

  for (person <- Seq(alice, bob, charlie)) {
    person match {
      case Persona("Alice", 25, Direccion(_, "Chicago", _)) => println("Hola Alice")
 			case Persona("Bob", 29, Direccion("2 Java Ave", "Miami", "USA")) => println("Hola Bob")
 			case Persona(name, edad,_)=> println(s"quien eres tu, $edad años con nombre: $name?")
    }                                             //> Hola Alice
                                                  //| Hola Bob
                                                  //| quien eres tu, 32 años con nombre: Charlie?
  }
}
case class Direccion(calle: String, ciudad: String, pais: String)
case class Persona(nombre: String, edad: Int, direccion: Direccion)