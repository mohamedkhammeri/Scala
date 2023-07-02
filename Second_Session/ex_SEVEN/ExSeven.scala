// Strings Exercises

object ExSeven {
  def distinct_words(words: String): Int = {
    Set.from(
      words
        .replaceAll("[.,;]", "") // Remove punctuations
        .split(" +") // Get words
    ).size // Length of distinct words
  }

  def main(args: Array[String]): Unit = {
    println(distinct_words("The quick brown fox jumps over the lazy dog."))
  }
}
