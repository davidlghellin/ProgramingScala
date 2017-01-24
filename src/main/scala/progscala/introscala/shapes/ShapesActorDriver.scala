// src/main/scala/progscala/introscala/shapes/ShapesActorDriver.scala

package progscala.introscala.shapes

import akka.actor.{Props, Actor, ActorRef,ActorSystem}
import com.typesafe.config.ConfigFactory

// mensaje usado solo en este fichero
private object Start

// el "driver" actor
object ShapesDrawingDriver {
  
  def main (args: Array[String]){
    
    val system = ActorSystem("DrawingActorSystem", ConfigFactory.load())
    
    val drawer= system.actorOf(Props(new ShapesDrawingActor), "drawingActor")
    /* RECORDAR
    def receive = {
    case s: Shape  =>
      s.draw(str => println(s"ShapesDrawingActor: $str"))
      sender ! Response (s"ShapesDrawingActor: $s drawn") //sender.!(Response(s"ShapesDrawingActor: $s drawn"))
    case Exit => 
      println(s"ShapesDrawingActor: exiting...")
      sender ! Finished 
    case unespected => 
      val response = Response (s"Error: Unknow message: $unespected")
      println(s"ShapesDrawingActor: $response")
      sender ! response
  	}
    */
    
    val driver = system.actorOf(Props(new ShapesDrawingDriver(drawer)), "drawingService")
    
    driver ! Start
  }  
}

class ShapesDrawingDriver(drawerActor: ActorRef) extends Actor {
  import Messages._
  
  def receive = {
    /*
     * Cuando recive "Start" lanza 5 asincronos
     */
    case Start =>
      drawerActor ! Circle(Point(0.0,0.0),1.0)
      drawerActor ! Rectangle(Point(0.0,0.0),2,5)
      drawerActor ! 3.14159    // sera considerado como ERROR
      drawerActor ! Triangle(Point(0.0,0.0), Point(2.0,0.0), Point(1.0,2.0))
      drawerActor ! Exit
    /*
     * Cierre del actor
     */
    case Finished =>
      println(s"ShapesDrawingDriver: cleaning up...")
      context.system.shutdown()
      
     /*
      * Como tratar la Respuesta (Response)
      */
    case response: Response =>
      println("ShapesDrawingDriver: Response = " + response)
      /*
       * No esperado, espera un Shape (figura)
       */
    case unexpected =>
      println("ShapesDrawingDriver: ERROR: Received an unexpected message = " + unexpected)
  }
}

// desde SBT hacemos run y selecionamos la opcion de este fichero
/*
[info] Running progscala.introscala.shapes.ShapesDrawingDriver 
ShapesDrawingActor: draw: Circle(Point(0.0,0.0),1.0)
ShapesDrawingActor: draw: Rectangle(Point(0.0,0.0),2.0,5.0)
ShapesDrawingActor: Response(Error: Unknow message: 3.14159)
ShapesDrawingDriver: Response = Response(ShapesDrawingActor: Circle(Point(0.0,0.0),1.0) drawn)
ShapesDrawingDriver: Response = Response(ShapesDrawingActor: Rectangle(Point(0.0,0.0),2.0,5.0) drawn)
ShapesDrawingDriver: Response = Response(Error: Unknow message: 3.14159)
ShapesDrawingActor: draw: Triangle(Point(0.0,0.0),Point(2.0,0.0),Point(1.0,2.0))
ShapesDrawingDriver: Response = Response(ShapesDrawingActor: Triangle(Point(0.0,0.0),Point(2.0,0.0),Point(1.0,2.0)) drawn)
ShapesDrawingActor: exiting...
ShapesDrawingDriver: cleaning up...

Podemos observar que los actores se envian en el mismo orden y se entremezclandose con la salida

Esta salida puede no coincidir con la siguiente
*/  
