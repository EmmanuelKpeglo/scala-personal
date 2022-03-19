package playground

import scala.collection.mutable
import scala.io.StdIn

object PlayGround {

  def main(args: Array[String]): Unit = {

    val number = StdIn.readLine.trim.toInt

    Solution(number)

//    val aList: List[Int] = List(1, 2, 3, 4)
//
//    def multiplyByTwo(x: Int): Int = x * 2
//    val newList: List[Int] = aList.map(multiplyByTwo)
//    println(newList.mkString)

//    val adjectives: List[String] = List("One", "Two", "Red", "Blue")
//    val nouns: List[String] = for (adjective <- adjectives) yield adjective + " Fish"
//
//    println(nouns.mkString("\n"))
//
//    val lengths = for (noun <- nouns) yield noun.length
//    println(lengths.mkString)
//
//    val plusOne = (number: Int) => number + 1
//
//    println(plusOne(2))
//    println(plusOne(5))
//    println(plusOne(8))
//
//    println(adjectives.filter(_.length == 3).mkString("\t"))
//
//    val tip = (12.toDouble / 100) * 20
//
//    val tax = (8.toDouble / 100) * 12
//
//    System.out.println(tip)
//    System.out.println(tax)
//
//    val total_cost = 12 + tip + tax
//
//    println(total_cost)
//    println(total_cost.round)
//
//    println(2.toFloat / 100)
//
//    for ( i <- 0 to 10) println(s"hey ${ 1 + i}" + i)

  }
  case class Solution (num: Int) {

  }
  object Solution {
    def apply(n: Int) = {
      for (i <- 1 to n) {
        val myString = StdIn.readLine
        var oddIndexes = ""
        var evenIndexes = ""

        var c = 0
//        while ( c < myString.size) {
//          if ( (c + 1 ) % 2 == 0){
//
//            evenIndexes = evenIndexes + myString.charAt(c)
//          }
//          else {
//            oddIndexes = oddIndexes + myString.charAt(c)
//          }
//          c = c + 1
//        }
//        println(s"$oddIndexes $evenIndexes")

        var s: mutable.Map[Char, Int] = mutable.Map.empty
        myString.foreach(character => {
          if (!s.contains(character)) {
            s.addOne(character -> 1)
            if ( (myString.indexOf(character) + s(character) ) % 2 == 0){
              evenIndexes = evenIndexes + character
            }
            else {
              oddIndexes = oddIndexes + character
            }
          }
          else {
            s.addOne(character -> (s(character) + 1))
            if ( (myString.indexOf(character) + s(character) ) % 2 == 0){
              evenIndexes = evenIndexes + character
            }
            else {
              oddIndexes = oddIndexes + character
            }
          }
        })
        println(s"$oddIndexes $evenIndexes")
      }
    }
  }
}
