object ExFour {
  def longest_subarray(numbers: Array[Int]): Array[Int] = {
    var temporarySequence: Array[Int] = Array() // Sequence of integer
    var sequence: Array[Int] = Array() // Sequence of integer
    for (idx <- numbers.indices) {
      if (idx > 0) {
        if (numbers.apply(idx - 1) != numbers.apply(idx) - 1) {
          // Check if it's the longest sequence
          if (sequence.length <= temporarySequence.length) {
            sequence = temporarySequence.clone()
          }
          temporarySequence = Array()
        }
      }

      temporarySequence = temporarySequence :+ numbers.apply(idx)
    }

    sequence
  }

  def main(args: Array[String]): Unit = {
    val numbers = Array(1, 2, 3, 5, 6, 7, 9)

    val result = longest_subarray(numbers)
    println(result.mkString("Array(", ", ", ")"))
  }
}
