// src/main/scala/progscala/rounding/traits.sc

object traits {

  val service1 = new ServiceImportante("uno")     //> service1  : ServiceImportante = ServiceImportante@3581c5f3

  (1 to 3) foreach (i => println(s"Result: ${service1.work(i)}"))
                                                  //> ServiceImportante: Haciendo trabajo importante! 1
                                                  //| Result: 2
                                                  //| ServiceImportante: Haciendo trabajo importante! 2
                                                  //| Result: 3
                                                  //| ServiceImportante: Haciendo trabajo importante! 3
                                                  //| Result: 4

  /* ////////////////////////////////////////////////////////// */
  val service2 = new ServiceImportante("dos") with StdoutLogging {
    override def work(i: Int): Int = {
      info(s"Empezando work: i = $i")
      val result = super.work(i)
      info(s"Terminando work: i = $i, result = $result")
      result
    }
  }                                               //> service2  : ServiceImportante with StdoutLogging = traits$$anonfun$main$1$$a
                                                  //| non$1@506e6d5e
  (1 to 3) foreach (i => println(s"Result: ${service2.work(i)}"))
                                                  //> INFO: Empezando work: i = 1
                                                  //| ServiceImportante: Haciendo trabajo importante! 1
                                                  //| INFO: Terminando work: i = 1, result = 2
                                                  //| Result: 2
                                                  //| INFO: Empezando work: i = 2
                                                  //| ServiceImportante: Haciendo trabajo importante! 2
                                                  //| INFO: Terminando work: i = 2, result = 3
                                                  //| Result: 3
                                                  //| INFO: Empezando work: i = 3
                                                  //| ServiceImportante: Haciendo trabajo importante! 3
                                                  //| INFO: Terminando work: i = 3, result = 4
                                                  //| Result: 4

  val serviceClass = new LoggedServiceImportante("tres")
                                                  //> serviceClass  : LoggedServiceImportante = LoggedServiceImportante@96532d6
  (1 to 3) foreach (i => println(s"Result: ${serviceClass.work(i)}"))
                                                  //> INFO: Empezando work: i = 11
                                                  //| ServiceImportante: Haciendo trabajo importante! 11
                                                  //| Result: 12
                                                  //| INFO: Empezando work: i = 12
                                                  //| ServiceImportante: Haciendo trabajo importante! 12
                                                  //| Result: 13
                                                  //| INFO: Empezando work: i = 13
                                                  //| ServiceImportante: Haciendo trabajo importante! 13
                                                  //| Result: 14
}
class ServiceImportante(name: String) {
  def work(i: Int): Int = {
    println(s"ServiceImportante: Haciendo trabajo importante! $i")
    i + 1
  }
}

/* Podria ser una interface de JAVA */
trait Logging {
  def info(message: String): Unit
  def warning(message: String): Unit
  def error(message: String): Unit
}

/* en esta interface ademas implementamos los metodos */
trait StdoutLogging extends Logging {
  def info(message: String) = println(s"INFO: $message")
  def warning(message: String) = println(s"WARNING: $message")
  def error(message: String) = println(s"ERROR:$message")
}

/* Si quisieramos multiples instancias podriamos hacer algo asi*/
class LoggedServiceImportante(name: String) extends ServiceImportante(name) with StdoutLogging {
  override def work(i: Int): Int = {
    val j = i + 10
    info(s"Empezando work: i = $j")
    super.work(j)
  }
}
  
  
  
  
  