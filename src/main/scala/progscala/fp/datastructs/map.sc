// src/main/scala/progscala/fp/datastructs/map.sc

object map {
  val stateCapitals = Map(
    "Alabama" -> "Montgomery",
    "Alaska" -> "Juneau",
    "Wyoming" -> "Cheyenne")                      //> stateCapitals  : scala.collection.immutable.Map[String,String] = Map(Alabama
                                                  //|  -> Montgomery, Alaska -> Juneau, Wyoming -> Cheyenne)

  val lengths = stateCapitals map {
    case kv => (kv._1, kv._2.length)
  }                                               //> lengths  : scala.collection.immutable.Map[String,Int] = Map(Alabama -> 10, A
                                                  //| laska -> 6, Wyoming -> 8)
  val caps = stateCapitals map {
    case (k, v) => (k, v.toUpperCase)
  }                                               //> caps  : scala.collection.immutable.Map[String,String] = Map(Alabama -> MONTG
                                                  //| OMERY, Alaska -> JUNEAU, Wyoming -> CHEYENNE)
  val stateCapitals2 = stateCapitals +
  	(
    	"Virginia" -> "Richmond"
    )                                             //> stateCapitals2  : scala.collection.immutable.Map[String,String] = Map(Alabam
                                                  //| a -> Montgomery, Alaska -> Juneau, Wyoming -> Cheyenne, Virginia -> Richmond
                                                  //| )

  val stateCapitals3 = stateCapitals2 +
  	(
    	"New York" -> "Albany",
    	"Illinois" -> "Springfield"
    )                                             //> stateCapitals3  : scala.collection.immutable.Map[String,String] = Map(Alaska
                                                  //|  -> Juneau, Virginia -> Richmond, Alabama -> Montgomery, New York -> Albany,
                                                  //|  Illinois -> Springfield, Wyoming -> Cheyenne)
   stateCapitals + "Virginia" -> "Richmond"       //> res0: (String, String) = (Map(Alabama -> Montgomery, Alaska -> Juneau, Wyomi
                                                  //| ng -> Cheyenne)Virginia,Richmond)
}