package OOP

class Rational (n: Int, d: Int) {
  require(d != 0, "\"denomintator\" must not be zero")

  private val gcd = greatestCommonDivider(n.abs, d.abs)
  val numerator = n / gcd
  val denominator = d / gcd
  override def toString: String = s"$numerator/$denominator"

  def this(n: Int) = this(n, 1)

  def + (that: Rational): Rational = {
    val newNumerator = (numerator * that.denominator) + (that.numerator * denominator)
    val newDenominator = denominator * that.denominator
    new Rational(newNumerator, newDenominator)
  }

  def * (that: Rational) = new Rational(numerator * that.numerator, denominator * that.denominator)

  def lessThan (that: Rational) = this.numerator * that.denominator < that.numerator * this.denominator

  def max (that: Rational) = if (this lessThan that) that else this

  private def greatestCommonDivider (a: Int, b: Int): Int = if (b == 0) a else greatestCommonDivider(b, a % b)

}

object Rational {
  def  main (args: Array[String]): Unit = {

    try {
      val oneHalf = new Rational(1, 2)
      val twoThirds = new Rational(2, 3)
      println(s"${oneHalf.toString} + ${twoThirds.toString} = ${oneHalf * twoThirds * twoThirds}")

    }catch {
      case e: IllegalArgumentException => println(e.getMessage)
    }
  }
}
