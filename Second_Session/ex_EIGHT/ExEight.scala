object ExEight {

  def most_frequent_char(str: String): Char = {
    var maxCounter = 0
    var maxChar = str.head

    for (idx <- str.indices) {
      var counter = 0
      for (j <- str.indices) {
        if (str.apply(idx) == str.apply(j)) {
          counter += 1
        }
      }

      // Check if it's the longest
      if (maxCounter < counter) {
        maxCounter = counter
        maxChar = str.apply(idx)
      }
    }

    maxChar
  }

  def main(args: Array[String]): Unit = {
    val str = "hello world"

    println(most_frequent_char(str))
  }

}
