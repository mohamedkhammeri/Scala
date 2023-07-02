object Main {
  def main(args: Array[String]): Unit = {
    print("Enter a year: ")
    val year = scala.io.StdIn.readInt()
    if (year % 4 == 0) {
      if (year % 100 != 0 || year % 400 == 0) {println("Leap year")}
    } else {println("Not a leap year")}
  }
}