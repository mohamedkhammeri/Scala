object Main {
  def main(args: Array[String]): Unit = {
    println("Type a character")
    val input = scala.io.StdIn.readChar()
    if (input.isLower) {
      println("Lowercase letter")
    } else if (input.isUpper) {
      println("Uppercase letter")
    } else if (input.isDigit) {
      println("Digit")
    } else {
      println("Check your input")
    }
  }
}