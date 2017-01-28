// src/main/scala/progscala2/typelessdomore/state_capitals_subset.sc

object state_capitals_subset {

  val stadosCapitales = Map(
    "Alabama" -> "Montgomery",
    "Alaska" -> "Juneau",
    "Wyoming" -> "Cheyenne")                      //> stadosCapitales  : scala.collection.immutable.Map[String,String] = Map(Alaba
                                                  //| ma -> Montgomery, Alaska -> Juneau, Wyoming -> Cheyenne)
  println("Obtener las capitales evueltos en Options:")
                                                  //> Obtener las capitales evueltos en Options:
  println("Alabama: " + stadosCapitales.get("Alabama"))
                                                  //> Alabama: Some(Montgomery)
  println("Alaska: " + stadosCapitales.get("Alaska"))
                                                  //> Alaska: Some(Juneau)
  println("Wyoming: " + stadosCapitales.get("Wyoming"))
                                                  //> Wyoming: Some(Cheyenne)
  println("Desconocido: " + stadosCapitales.get("Desconocido"))
                                                  //> Desconocido: None

  /* Como podemos ver en vez de devolver un null, tenemos "None"*/

  println("Get the capitals themselves out of the Options")
                                                  //> Get the capitals themselves out of the Options
  println("Alabama: " + stadosCapitales.get("Alabama").get)
                                                  //> Alabama: Montgomery
  println("Alaska: " + stadosCapitales.get("Alaska").getOrElse("Oops!"))
                                                  //> Alaska: Juneau
  println("Desconocido: " + stadosCapitales.get("Desconocido").getOrElse("Oops2!"))
                                                  //> Desconocido: Oops2!

	/* Usando "getOrElse" tenemos una gran opcion para lanzar excepciones */
	
	/* Podemos usar "null" para trabajar con librerias Java */
}