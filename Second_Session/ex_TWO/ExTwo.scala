import scala.collection.immutable.TreeSet

object ExTwo {
  def highest_frequency(numbers: Array[Int], k: Int): Set[Int] = {
    var highestNumbers: Set[Int] = TreeSet.empty(Ordering[Int].reverse)
    for (number <- numbers) {
      var counter: Integer = 0
      for (_number <- numbers) {
        if (_number.equals(number)) {
          counter += 1
        }
      }
      // Check for frequency
      if (counter >= k) {
        highestNumbers = highestNumbers.+(number)
      }
    }

    highestNumbers
  }

  def main(args: Array[String]): Unit = {
    val numbers = Array(1, 2, 3, 2, 3, 4, 3, 4, 5)
    val results: Set[Int] = highest_frequency(numbers, 2)

    println(results)
  }
}