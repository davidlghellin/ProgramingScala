package progscala.introscala

object Upper {
  
  def main(args: Array[String]) =
  {
    args.map(_.toUpperCase()).foreach(printf("%s ", _))
    println()
  }
}
/**
 * como podemos ver, tenemos los argumentos que le pasamos al metodo main
 * le hacemos el map para cada uno de los parametros de entrada 
 * todos ellos le hacemos un upper, seguidamente le aplicamos el foreach y la funcion que le pasamos es printf
 * 
 */

// compilar
//workspaceScala/ProgramingScala$ scalac src/main/scala/progscala/introscala/Upper.scala 

// ejecutar
//workspaceScala/ProgramingScala$ scala -cp . progscala.introscala.Upper hola que haces?
//HOLA QUE HACES? 


/** SBT */
//tambien podemos correr SBT
/*
/workspaceScala/ProgramingScala$ sbt
[info] Set current project to ProgramingScala (in build file:/home/wizord/workspaceScala/ProgramingScala/)
> run-main progscala.introscala.Upper hola que haces?
[info] Compiling 1 Scala source to /home/wizord/workspaceScala/ProgramingScala/target/scala-2.11/classes...
[info] Running progscala.introscala.Upper hola que haces?
HOLA QUE HACES? 
[success] Total time: 3 s, completed 22-ene-2017 18:32:32

*/