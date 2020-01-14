package cl.scala.meetup.classes

object SingletonScala {

  def main(args: Array[String]): Unit = {
    Logger.log("INFO", "I'm logger")
  }


  def getSingletonInstance(): Unit ={
    Logger.log("INFO", "I'm the same instance logger")
  }
}


object Logger {

  def log(level: String, message: String): Unit = {
      //TODO define here
  }

}




