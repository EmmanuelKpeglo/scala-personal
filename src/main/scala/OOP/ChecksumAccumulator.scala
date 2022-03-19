package OOP

import scala.collection.mutable

class ChecksumAccumulator {
  private var sum = 0

  def add(number: Int) = sum += number

  def checksum() = (sum & 0xFF) + 1

}

object ChecksumAccumulator {
  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String) = {
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }

  }

  def main(args: Array[String]) = {

    val acc = new ChecksumAccumulator
    println(acc.checksum())
    acc.add(6)
    println(acc.checksum())

    val calc = ChecksumAccumulator.calculate("Halo On Fire")
    println(calc)

  }
}
