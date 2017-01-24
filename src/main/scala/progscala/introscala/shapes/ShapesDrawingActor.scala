package progscala.introscala.shapes


/*
 * Declaramos un objeto mensaje que sera lo que pasemos entre actores, "Exit & Finished" son banderas
 */
object Messages {
  object Exit
  object Finished
  case class Response(message: String)
}

import akka.actor.Actor

/*
 * Definicmos la clase que hereda de Actor
 */
class ShapesDrawingActor extends Actor {
  /*
   * Importamos los mensajes definidos anteriormente, en scala podemos importar en arbol
   */
  import Messages._
  
  /*
   * Impplementamos el unico metodo que tenemos que implementar Actor.receive
   */
  def receive = {
    /*
     * Los mensajes que pasa cada actor se almacenan en un buzon, cada mensaje se procesara en orden
     * y los casos se definen con case X:
     */
    case s: Shape  =>
      s.draw(str => println(s"ShapesDrawingActor: $str"))
      sender ! Response (s"ShapesDrawingActor: $s drawn") //sender.!(Response(s"ShapesDrawingActor: $s drawn"))
      // la forma de enviar mensajes asíncromos
    case Exit => 
      println(s"ShapesDrawingActor: exiting...")
      sender ! Finished 
    case unespected => //default. Equivalente to Any
      val response = Response (s"Error: Unknow message: $unespected")
      println(s"ShapesDrawingActor: $response")
      sender ! response
  }
  
}