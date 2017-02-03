// src/main/scala/progscala/implicits/implicitly_args.sc

object implicitly_args {

  import math.Ordering


  case class MyList[A](list: List[A]) {
    def sortBy1[B](f: A => B)(implicit ord: Ordering[B]): List[A] =
      list.sortBy(f)(ord)
    def sortBy2[B: Ordering](f: A => B): List[A] =
      list.sortBy(f)(implicitly[Ordering[B]])
  }
  val list = MyList(List(1, 3, 5, 2, 4))          //> list  : implicitly_args.MyList[Int] = MyList(List(1, 3, 5, 2, 4))
  list sortBy1 (i => -i)                          //> res0: List[Int] = List(5, 4, 3, 2, 1)
  list sortBy2 (i => -i)                          //> res1: List[Int] = List(5, 4, 3, 2, 1)

}