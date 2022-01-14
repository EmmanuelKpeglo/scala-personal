package playground

object PlayGround extends App {
//  println("Hello world!")
//  var capital = Map("US" -> "Washington", "Fance" -> "Paris")
//  capital += ("Japan" -> "Tokyo")
//  capital.foreach(capital => println(capital._1 + " -> " + capital._2))
//
//  def factorial(x:BigInt):BigInt = {
//    if ( x == 0) 1 else x * factorial( x - 1)
//  }
//
//  println(factorial(9))

  var someObject = new SomeClass(1, "yoshi")
  println(someObject.getIndex())
  someObject.setIndex(5)
  println(someObject.getIndex())

}
