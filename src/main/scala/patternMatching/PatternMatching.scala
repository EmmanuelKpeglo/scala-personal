package patternMatching

object PatternMatching {
  def main (args: Array[String]): Unit = {
    val number = 9
    val englishWordForNumber = number match {
      case 9 => {
        println("hey yoo")
        "nine"
      }
      case 6 => "six"
      case 3 => "three"
      case _ => "number matches nothing"
    }
    println(englishWordForNumber)

    println("-------------Book-------------")
    val rosalinda = Book("Rosalinda", 1982, "Yoshi", "5468522")
    val twist = Book("Twist", 1972, "Warrio", "86574")
    val rye = Book("Rye", 1775, "Lee", "25488")

    Book.bookMatcher(rosalinda)
  }
}
