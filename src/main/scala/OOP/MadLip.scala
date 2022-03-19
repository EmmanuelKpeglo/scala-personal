package OOP

import scala.io.StdIn

case class MadLip() {

}

object MadLip {

  def evenOddIndex() = {
    val numberOfInputs = StdIn.readLine.trim.toInt
    for (numberOfInput <- 1 to numberOfInputs) {
      val input = StdIn.readLine
      val oddIndexes = input.split("")
        .indices
        .filter(index => index % 2 != 0)
        .map(index => input(index))
        .mkString

      val evenIndexes = input.split("")
        .indices
        .filter(index => index % 2 == 0)
        .map(index => input(index))
        .mkString

      println(s"$evenIndexes $oddIndexes")
    }
  }

  def main (args: Array[String]) = {
    evenOddIndex()
  }
}