package progscala.introscala.shapes

case class Point(x: Double =0.0,y: Double = 0.0)

abstract class Shape {
  
  def draw(f: String => Unit) : Unit = f(s"draw: ${this.toString()}")
}

case class Circle(center: Point, radius: Double) extends Shape

case class Rectangle(lowerLeft: Point, height: Double, width: Double) extends Shape

case class Triangle(point1: Point, point2: Point, point3: Point) extends Shape

// cuando creamos case class , scala nos crea los getters, toString, equals y hasCode
// son variables inmutables lo que crea por ello no tenemos los setters
// Scala al comparar (case class) no hace como Java que comprueba el puntero

// para ejecutarlo usaremos la consola de SBT
/*
/workspaceScala/ProgramingScala$ sbt
[info] Set current project to ProgramingScala (in build file:/home/wizord/workspaceScala/ProgramingScala/)
> compile
[info] Updating {file:/home/wizord/workspaceScala/ProgramingScala/}programingscala...
[info] Resolving jline#jline;2.12.1 ...
[info] Done updating.
[info] Compiling 3 Scala sources to /home/wizord/workspaceScala/ProgramingScala/target/scala-2.11/classes...
[success] Total time: 4 s, completed 22-ene-2017 19:08:42
> console
[info] Starting scala interpreter...
[info] 
Welcome to Scala 2.11.8 (OpenJDK 64-Bit Server VM, Java 1.8.0_121).
Type in expressions for evaluation. Or try :help.

scala> import progscala.introscala.shapes._
import progscala.introscala.shapes._

scala> val p00 = new Point
p00: progscala.introscala.shapes.Point = Point(0.0,0.0)

scala> val p20 = new Point(2.0)
p20: progscala.introscala.shapes.Point = Point(2.0,0.0)

scala> val p20b = new Point(2.0)
p20b: progscala.introscala.shapes.Point = Point(2.0,0.0)

scala> val p02 = new Point(y=2.0)
p02: progscala.introscala.shapes.Point = Point(0.0,2.0)

scala> p00 == p20
res0: Boolean = false

scala> p20b == p20
res1: Boolean = true

scala> p00
res2: progscala.introscala.shapes.Point = Point(0.0,0.0)
*/