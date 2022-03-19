package playground

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object TwoDArray {
  def main(args: Array[String]) {

    val sums: ListBuffer[Int] = ListBuffer()
    val arr = Array.ofDim[Int](6, 6)

//    var myArray = Array.ofDim[Int](6, 6)
    var myArray = Array(
      Array(1, 1, 1, 0, 0, 0),
      Array(0, 1, 0, 0, 0, 0),
      Array(1, 1, 1, 0, 0, 0),
      Array(0, 0, 2, 4, 4, 0),
      Array(0, 0, 0, 2, 0, 0),
      Array(0, 0, 1, 2, 4, 0)
    )

    for (outerArrayIndex <- 0 to 3) {
      for (innerArrayIndex <- 0 to 3) {
        var tempSum = myArray(outerArrayIndex)(innerArrayIndex) + myArray(outerArrayIndex)(innerArrayIndex + 1) + myArray(outerArrayIndex)(innerArrayIndex + 2) //top
        tempSum = tempSum + myArray(outerArrayIndex + 1)(innerArrayIndex + 1) //middle
        tempSum = tempSum + myArray(outerArrayIndex + 2)(innerArrayIndex) + myArray(outerArrayIndex + 2)(innerArrayIndex + 1) + myArray(outerArrayIndex + 2)(innerArrayIndex + 2) //bottom
        sums.addOne(tempSum)
      }
    }

    println(sums.max)

//    for (i <- 0 until 6) {
//      arr(i) = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
//    }
//    arr.map()
  }
}
