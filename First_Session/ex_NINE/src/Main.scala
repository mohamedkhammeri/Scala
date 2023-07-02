object Main {
  def main(args: Array[String]): Unit = {
    println("What's your grade ?")
    val grade = scala.io.StdIn.readChar().toUpper
    if (grade == 'A'){println("Excellent")}
    else if (grade == 'B'){println("Good Job")}
    else if (grade == 'C'){println("Keep it up")}
    else if (grade == 'D'){println("Tou need to improve")}
    else if (grade == 'F'){println(" --- FAILED ---")}
  }
}