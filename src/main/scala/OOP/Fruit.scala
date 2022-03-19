package OOP

case class Fruit(name: String) {

}
object FruitSObject {

  def main (args: Array[String]): Unit = {
    val apple = Fruit("apple")
    val orange = Fruit("orange")
    val kiwi = Fruit("kiwi")
    println(apple.toString)
  }
}