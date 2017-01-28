package progscala.patternmatching

object scoped_option_for {
  val dogBreeds = List(Some("Doberman"), None, Some("Yorkshire Terrier"),
    Some("Dachshund"), None, Some("Scottish Terrier"),
    None, Some("Great Dane"), Some("Portuguese Water Dog"))
                                                  //> dogBreeds  : List[Option[String]] = List(Some(Doberman), None, Some(Yorkshir
                                                  //| e Terrier), Some(Dachshund), None, Some(Scottish Terrier), None, Some(Great 
                                                  //| Dane), Some(Portuguese Water Dog))
  println("first pass:")                          //> first pass:
  for {
    breedOption <- dogBreeds	/* Con esto quitamos los "none" */
    breed <- breedOption			/* Con este quitamos los "some(XXX)" */
    upcasedBreed = breed.toUpperCase()
  } println(breedOption)                          //> Some(Doberman)
                                                  //| Some(Yorkshire Terrier)
                                                  //| Some(Dachshund)
                                                  //| Some(Scottish Terrier)
                                                  //| Some(Great Dane)
                                                  //| Some(Portuguese Water Dog)
  println("second pass:")                         //> second pass:
  for {
    Some(breed) <- dogBreeds
    upcasedBreed = breed.toUpperCase()
  } println(upcasedBreed)                         //> DOBERMAN
                                                  //| YORKSHIRE TERRIER
                                                  //| DACHSHUND
                                                  //| SCOTTISH TERRIER
                                                  //| GREAT DANE
                                                  //| PORTUGUESE WATER DOG


	/* Usaremos la "<-" para iterar en una coleccion (u otro contenedor) con opcion y extrayendo valores */
}