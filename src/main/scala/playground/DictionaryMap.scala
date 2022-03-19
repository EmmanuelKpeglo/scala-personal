package playground

import scala.collection.mutable
import scala.io.StdIn

object DictionaryMap {
  def main (args: Array[String]) = {
    val numberOfEntries = StdIn.readLine.trim.toInt

    val phoneBook: mutable.Map[String, Int] = mutable.Map.empty

    for (input <- 1 to numberOfEntries) {
      val nameAndNumber = StdIn.readLine.split(" ").toList
      phoneBook.addOne(nameAndNumber(0) -> nameAndNumber(1).toInt)
    }

    var input = true
    while (input) {
      val nameToSearch = Option(StdIn.readLine())

      if (phoneBook.contains(nameToSearch.get)){
        println(s"${nameToSearch match {
          case None =>""
          case Some(value) => value
        }}=${phoneBook(nameToSearch.get)}")
      }
      else if (nameToSearch match {
        case None => true
        case Some(value) => true
      }) {
        input = false
      }
      else {
        println("Not found")
      }
    }

  }
}
