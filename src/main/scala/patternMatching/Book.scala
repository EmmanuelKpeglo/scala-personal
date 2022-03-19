package patternMatching

case class Book(title: String, yearPublished: Int, author: String, isbn: String) {

}

object Book {
  def bookMatcher(book: Book): Unit = {
    book match {
      case Book(title, yearPublished, author, isbn) => println(s"$title -- $yearPublished -- $author -- $isbn")
      case _ => println("book matches nothing")
    }
  }
}
