object ExOne {
  def word_occurrence(words: Array[String]): String = {
    var mostOccurrenceWord: String = words.head
    var mostOccurrenceWordCounter: Integer = 0
    for (word <- words) {
      var counter: Integer = 0
      for (_elem <- words) {
        if (_elem.equals(word)) {
          counter += 1
        }
      }
      // Check for occurrences
      if (counter > mostOccurrenceWordCounter) {
        mostOccurrenceWord = word
        mostOccurrenceWordCounter = counter
      }
    }

    mostOccurrenceWord
  }

  def main(args: Array[String]): Unit = {
    var keywords = Array("apple", "banana", "cherry", "banana", "apple", "date", "apple")
    var mostOccurredWord: String = word_occurrence(keywords)

    println(mostOccurredWord)
  }
}