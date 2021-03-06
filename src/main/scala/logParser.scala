package smartbot

import scala.io.Source
import java.io.FileWriter


object LogParser {

  def getDepth(s: String): Option[Int] = {
    /** If the string is a number, returns the option of it,
     *  otherwise it returns None */
    val IntRegEx = "(\\d+)".r
    s match {
      case IntRegEx(num) => Some(num.toInt)
      case _ => None
    }
  }

  def getMessages(file: String): (Option[Int], Iterator[String]) = {
    val messages = Source.fromFile(file).getLines
    val firstLine = messages.next()
    (getDepth(firstLine), messages)
  }

  def addToLog(file: String, message: String) = {
    val log = new FileWriter(file, true)
    log.write(message + "\n")
    log.close()
    println("Added " + message + " to " + file)
  }
}
