// src/main/scala/progscala/rounding/yielding_for.sc

object yielding_for {
  val perros = List("Doberman", "Yorkshire Terrier", "Dachshund",
    "Scottish Terrier", "Great Dane", "Portuguese Water Dog")
                                                  //> perros  : List[String] = List(Doberman, Yorkshire Terrier, Dachshund, Scotti
                                                  //| sh Terrier, Great Dane, Portuguese Water Dog)
   
   
  val filteredPerros = for {
    breed <- perros
    if breed.contains("Terrier") && !breed.startsWith("Yorkshire")
  } yield breed                                   //> filteredPerros  : List[String] = List(Scottish Terrier)


	/* Si queremos devolver los datos en vez de imprimir usaremos "yield" para pasarlos como List */
	/* podemos ver que estamos usando llaves en vez de parentesis, esto es porque tenemos multiples expresiones */
}