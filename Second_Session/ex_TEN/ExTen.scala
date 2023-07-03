object ExTen {

  def shortest_seq(str: String, set_of_chars: Set[Char]): String = {
    var seq = str + ""
    var temporary_seq = ""

    // The temporary sequence has all characters from the Set
    def hasAllChars(): Boolean = {
      var hasAllChars = true
      for (char <- set_of_chars) { // Iterate Set
        if (!temporary_seq.contains(char)) {
          hasAllChars = false
        }
      }

      hasAllChars
    }

    // Shortest or not
    def checkForSequence(): Unit = {
      if (seq.length > temporary_seq.length) {
        if (hasAllChars()) {
          seq = temporary_seq + ""
        }
        temporary_seq = ""
      }
    }

    // Iterate string
    for (idx <- str.indices) {
      val currentChar = str.apply(idx)

      if (set_of_chars.contains(currentChar)) {
        if (temporary_seq.contains(currentChar)) { // Redundant characters
          if (hasAllChars() && seq.length > temporary_seq.length) { // Check for last substring
            seq = temporary_seq + ""
          }

          // Transition possibility
          if (temporary_seq.head != currentChar) {
            temporary_seq = ""
          } else {
            temporary_seq = temporary_seq.replace(currentChar + "", "")
          }
        }

        // Append current character to the temporary sequence
        temporary_seq = temporary_seq + currentChar

        if (hasAllChars() && seq.length > temporary_seq.length) {
          seq = temporary_seq + ""
          temporary_seq = ""
        }
      } else {
        // Not includes in the Set of characters
        checkForSequence()
      }
    }

    checkForSequence()

    seq
  }

  /**
   * Shortest sequence must be a sequence of characters included in the set.
   *
   * Example:
   * - Input: "abbcbcba", Set('a', 'b', 'c')
   * - Output: "cba"
   * ---------------
   * - Input: "abbcbcba", Set('a', 'b')
   * - Output: "ba"
   */
  def main(args: Array[String]): Unit = {
    println(shortest_seq("abbcbcba", Set('a', 'b', 'c')))
  }

}
