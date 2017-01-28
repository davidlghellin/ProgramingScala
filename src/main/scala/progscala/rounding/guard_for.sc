// src/main/scala/progscala/rounding/guard_for.sc

object guard_for {

  val perros = List("Doberman", "Yorkshire Terrier", "Dachshund",
    "Scottish Terrier", "Great Dane", "Portuguese Water Dog")
                                                  //> perros  : List[String] = List(Doberman, Yorkshire Terrier, Dachshund, Scotti
                                                  //| sh Terrier, Great Dane, Portuguese Water Dog)

  for (p <- perros if p.contains("Terrier"))
    println(p)                                    //> Yorkshire Terrier
                                                  //| Scottish Terrier


  /* vemos que en el forEach tenemos condiciones a eso lo llamamos "Guardas" */
}