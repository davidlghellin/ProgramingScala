

object hofs_example {
  (1 to 10)                                       //> res0: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7,
                                                  //|  8, 9, 10)
  (1 to 10).filter(_ % 2 == 0)                    //> res1: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10)
  (1 to 10).filter(_ % 2 == 0).map(_ * 2)         //> res2: scala.collection.immutable.IndexedSeq[Int] = Vector(4, 8, 12, 16, 20)
  (1 to 10).filter(_ % 2 == 0).map(_ * 2).reduce(_ * _)
                                                  //> res3: Int = 122880
 
 
  (1 to 10).filter(_ % 2 == 0).map(_ * 2).reduce(_ + _)
                                                  //> res4: Int = 60

}