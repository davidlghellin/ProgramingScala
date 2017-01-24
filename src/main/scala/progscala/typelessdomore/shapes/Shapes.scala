package progscala.typelessdomore.shapes

case class Point(x: Double = 0.0, y: Double = 0.0) {
  def shift(deltax: Double = 0.0, deltay: Double = 0.0) = copy(x + deltax, y + deltay)
}

/*$ sbt
[info] Loading global plugins from /home/wizord/.sbt/0.13/plugins
[info] Set current project to ProgramingScala (in build file:/home/wizord/workspaceScala/ProgramingScala/)
> compile
[info] Updating {file:/home/wizord/workspaceScala/ProgramingScala/}programingscala...
[info] Resolving jline#jline;2.12.1 ...
[info] Done updating.
[info] Compiling 6 Scala sources to /home/wizord/workspaceScala/ProgramingScala/target/scala-2.11/classes...
[warn] there was one deprecation warning; re-run with -deprecation for details
[warn] one warning found
[success] Total time: 5 s, completed 24-ene-2017 22:56:16
> console
[info] Starting scala interpreter...
[info] 
Welcome to Scala 2.11.8 (OpenJDK 64-Bit Server VM, Java 1.8.0_121).
Type in expressions for evaluation. Or try :help.

scala> import progscala.typelessdomore.shapes._
import progscala.typelessdomore.shapes._

scala> val p1 = new Point()
p1: progscala.typelessdomore.shapes.Point = Point(0.0,0.0)

scala> val p2 = new Point(x=2,y=3.3)
p2: progscala.typelessdomore.shapes.Point = Point(2.0,3.3)

scala> val pcopy = p2.copy(y=6.6)
pcopy: progscala.typelessdomore.shapes.Point = Point(2.0,6.6)
*/

abstract class Shape() {
  def draw(offset: Point = Point(0.0, 0.0))(f: String => Unit): Unit =
    f(s"draw(offset = $offset), ${this.toString}")
    
  /*
   * En esta version tenemos los argumentos separados por ","
   */
  def draw2(offset: Point = Point(0.0, 0.0),f: String => Unit): Unit =
    f(s"draw(offset = $offset), ${this.toString}")
  
}
case class Circle(center: Point, radius: Double) extends Shape
case class Rectangle(lowerLeft: Point, height: Double, width: Double)
  extends Shape

/* sbt
> compile
[info] Compiling 1 Scala source to /home/wizord/workspaceScala/ProgramingScala/target/scala-2.11/classes...
[success] Total time: 1 s, completed 24-ene-2017 23:03:58
> console
[info] Starting scala interpreter...
[info] 
Welcome to Scala 2.11.8 (OpenJDK 64-Bit Server VM, Java 1.8.0_121).
Type in expressions for evaluation. Or try :help.

scala> import progscala.typelessdomore.shapes._
import progscala.typelessdomore.shapes._

scala> c.draw(new Point(8,8)){str => println(s"ShappesDrawingActor: $str ")}
ShappesDrawingActor: draw(offset = Point(8.0,8.0)), Circle(Point(2.0,3.0),2.2)

scala> c.draw2(new Point(8,8),{str => println(s"ShappesDrawingActor: $str ")})
ShappesDrawingActor: draw(offset = Point(8.0,8.0)), Circle(Point(2.0,3.0),2.2)

*/