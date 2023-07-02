// Strings Exercises

object ExSix {
  private def longest_subsequence(word: String): String = {
    var temporarySequence: String = "" // Sequence of integer
    var sequence: String = "" // Sequence of integer
    for (idx <- word.indices) {
      if (idx > 0) {
        if (word.apply(idx - 1) != word.apply(idx) - 1) {
          // Check if it's the longest sequence
          if (sequence.length <= temporarySequence.length) {
            sequence = temporarySequence
          }
          temporarySequence = ""
        }
      }

      temporarySequence = temporarySequence :+ word.apply(idx)
    }

    sequence
  }

  def main(args: Array[String]): Unit = {
    val word = "abcabcbb"

    val result = longest_subsequence(word)
    println(result)
  }
}
