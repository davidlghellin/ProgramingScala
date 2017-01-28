// src/main/scala/progscala/rounding/basic_for.sc

object basic_for {
  val perros = List("Doberman", "Yorkshire Terrier", "Dachshund",
    "Terrier", "Great Dane", "Portuguese Water Dog")
                                                  //> perros  : List[String] = List(Doberman, Yorkshire Terrier, Dachshund, Terrie
                                                  //| r, Great Dane, Portuguese Water Dog)
  
  
  /* esto es un "forEach" */
  /* loop */
  /*  la "<-" es un generador */
  for (p <- perros)
    println(p)                                    //> Doberman
                                                  //| Yorkshire Terrier
                                                  //| Dachshund
                                                  //| Terrier
                                                  //| Great Dane
                                                  //| Portuguese Water Dog
}