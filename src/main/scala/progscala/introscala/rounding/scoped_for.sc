// src/main/scala/progscala/rounding/scoped_for.sc

object scoped_for {
  val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund",
    "Scottish Terrier", "Great Dane", "Portuguese Water Dog")
                                                  //> dogBreeds  : List[String] = List(Doberman, Yorkshire Terrier, Dachshund, Sco
                                                  //| ttish Terrier, Great Dane, Portuguese Water Dog)
  for {
    breed <- dogBreeds
    upcasedBreed = breed.toUpperCase()
  } println(upcasedBreed)                         //> DOBERMAN
                                                  //| YORKSHIRE TERRIER
                                                  //| DACHSHUND
                                                  //| SCOTTISH TERRIER
                                                  //| GREAT DANE
                                                  //| PORTUGUESE WATER DOG

	/* podemos ver que usamos una variable para luego poder usarla despues localmente y hacer mas cosas */
}