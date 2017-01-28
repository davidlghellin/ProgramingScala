// src/main/scala/progscala2/rounding/assigned_if.sc

object assigned_if {

  val configFile = new java.io.File("somefile.txt")
                                                  //> configFile  : java.io.File = somefile.txt
  val configFilePath = if (configFile.exists()) {
    configFile.getAbsolutePath()
  } else {
    configFile.createNewFile()
    configFile.getAbsolutePath()
  }                                               //> configFilePath  : String = /home/wizord/Documentos/Programas/scala-SDK-4.5.0
                                                  //| -vfinal-2.11-linux.gtk.x86_64/eclipse/somefile.txt
}