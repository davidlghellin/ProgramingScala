// src/main/scala/progscala/rounding/double_guard_for.sc

object double_guard_for {

  val perros = List("Doberman", "Yorkshire Terrier", "Dachshund",
    "Scottish Terrier", "Great Dane", "Portuguese Water Dog")
                                                  //> perros  : List[String] = List(Doberman, Yorkshire Terrier, Dachshund, Scotti
                                                  //| sh Terrier, Great Dane, Portuguese Water Dog)
       
  for (breed <- perros
  	if breed.contains("Terrier")
  	if !breed.startsWith("Yorkshire")
  ) println(breed)                                //> Scottish Terrier
  
  for (breed <- perros
  	if breed.contains("Terrier") && !breed.startsWith("Yorkshire")
  ) println(breed)                                //> Scottish Terrier

	/* Podemos ver que tenemos multiples condiciones para realizar el forEach */
}