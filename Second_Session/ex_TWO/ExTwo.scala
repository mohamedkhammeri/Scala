import scala.collection.immutable.{ListMap, TreeSet}

object ExTwo {
  def highest_frequency(numbers: Array[Int], k: Int): Set[Int] = {
    var highestNumbers: Set[Int] = TreeSet.empty(Ordering[Int].reverse)
    var numberOccurrence: Map[Int, Int] = Map()
    for (number <- numbers) {
      var counter: Integer = 0

      if (numberOccurrence.contains(number)) {
        counter = numberOccurrence.apply(number)
      }
      numberOccurrence = numberOccurrence + (number -> (counter + 1))
    }

    // Sort the map by value
    val res = ListMap(numberOccurrence.toSeq.sortWith(_._2 > _._2): _*)
    // Get first k numbers
    for (i <- 0 to k) {
      highestNumbers = highestNumbers.+(res.toSeq(i)._2)
    }
    highestNumbers
  }

  def main(args: Array[String]): Unit = {
    val numbers = Array(1, 2, 3, 2, 3, 4, 3, 4, 5)
    val results: Set[Int] = highest_frequency(numbers, 2)

    println(results)
  }
}