// src/main/scala/progscala/patternmatching/match_deep_tuple.sc

object match_deep_tuple {
  val itemCost = Seq(("Pecil", 0.52), ("Paper", 1.35), ("Noteboock", 2.43))
                                                  //> itemCost  : Seq[(String, Double)] = List((Pecil,0.52), (Paper,1.35), (Notebo
                                                  //| ock,2.43))
  val itemCostIndices = itemCost.zipWithIndex     //> itemCostIndices  : Seq[((String, Double), Int)] = List(((Pecil,0.52),0), ((P
                                                  //| aper,1.35),1), ((Noteboock,2.43),2))

  for (itemIndex <- itemCostIndices) {
    itemIndex match {
      case ((item, cost), index) => println(s"$index: $item precio $cost unidad")
    }                                             //> 0: Pecil precio 0.52 unidad
                                                  //| 1: Paper precio 1.35 unidad
                                                  //| 2: Noteboock precio 2.43 unidad
  }
}