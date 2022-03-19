package playground
import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object DecToBin {
  def main (args: Array[String]) = {
    val binaryRepresentation: ListBuffer[Int] = ListBuffer()
    print("Enter decimal number:\t ")
    var decimalNumber = StdIn.readLine().trim.toInt
    val decimalNumberBeforeMutation = decimalNumber
    while (decimalNumber > 0) {
      binaryRepresentation.prepend(decimalNumber % 2)
      decimalNumber = decimalNumber / 2
    }
    println(s"The binary representation of $decimalNumberBeforeMutation is ${binaryRepresentation.mkString}")

    val maxConsecutiveOnes = binaryRepresentation.mkString
      .split("0")
      .toList
      .map(_.toList)
      .map(_.size)
      .max

    println(s"The maximum number of consecutive 1's is $maxConsecutiveOnes")
  }
}
