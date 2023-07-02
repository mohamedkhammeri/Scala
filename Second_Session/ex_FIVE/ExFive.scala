object ExFive {

  def sortByLengthAndLexico(word1: String, word2: String): Boolean = {
    word1.length > word2.length && word1.compareTo(word2) > 0
  }

  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "date", "cherry", "fig")
    println((words.sortWith(sortByLengthAndLexico).mkString("Array(", ", ", ")")))
  }
}
