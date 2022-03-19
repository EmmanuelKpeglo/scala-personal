package OOP

case class Person(name: String, age: Int) {

}

object Person {
  def apply(name: String, age: Int) = {
    new Person(name, age)
  }

  def main (args: Array[String]) = {

    val p1 = new Person("Onini", 96)

    println(p1 == Person("Onini", 96))
  }
}
