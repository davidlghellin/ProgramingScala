// src/main/scala/progscala/rounding/enumeration.sc

object enumeration {
  import Breed._

  println("ID\tBreed")                            //> ID	Breed
  for (breed <- Breed.values) println(s"${breed.id}\t$breed")
                                                  //> 0	Doberman Pinscher
                                                  //| 1	Yorkshire Terrier
                                                  //| 2	Scottish Terrier
                                                  //| 3	Great Dane
                                                  //| 4	Portuguese Water Dog

  // lista de Terrier breeds
  println("\nJust Terriers:")                     //> 
                                                  //| Just Terriers:
  Breed.values filter (_.toString.endsWith("Terrier")) foreach println
                                                  //> Yorkshire Terrier
                                                  //| Scottish Terrier

  /* definimos una funcion que termina en "Terrier" */
  def isTerrier(b: Breed) = b.toString.endsWith("Terrier")
                                                  //> isTerrier: (b: Breed.Breed)Boolean
  println("\nTerriers de nuevo??")                //> 
                                                  //| Terriers de nuevo??
  Breed.values filter isTerrier foreach println   //> Yorkshire Terrier
                                                  //| Scottish Terrier

  Breed.values.filter(isTerrier).foreach(println) //> Yorkshire Terrier
                                                  //| Scottish Terrier
}

object Breed extends Enumeration {
  type Breed = Value
  val doberman = Value("Doberman Pinscher")
  val yorkie = Value("Yorkshire Terrier")
  val scottie = Value("Scottish Terrier")
  val dane = Value("Great Dane")
  val portie = Value("Portuguese Water Dog")
}