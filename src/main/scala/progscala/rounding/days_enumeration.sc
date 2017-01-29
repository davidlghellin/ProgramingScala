// src/main/scala/progscala/rounding/days_enumeration.sc

object days_enumeration {
  import WeekDay._
  def isWorkingDay(d: WeekDay) = !(d == Sat || d == Sun)
                                                  //> isWorkingDay: (d: WeekDay.WeekDay)Boolean
  WeekDay.values filter isWorkingDay foreach println
                                                  //> Mon
                                                  //| Tue
                                                  //| Wed
                                                  //| Thu
                                                  //| Fri

  def isFestive(d: WeekDay): Boolean = { (d == Sat || d == Sun) }
                                                  //> isFestive: (d: WeekDay.WeekDay)Boolean

  WeekDay.values.filter(dia => isFestive(dia)).foreach((i: WeekDay) => println(i))
                                                  //> Sat
                                                  //| Sun
  WeekDay.values.filter(dia => isFestive(dia)).foreach(i => println(i))
                                                  //> Sat
                                                  //| Sun
}

object WeekDay extends Enumeration {
  type WeekDay = Value /* Para declarar enumeraion necesitamos esto */
  val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value

}