object Main {
  def main(args: Array[String]): Unit = {
    println("First number PLEASE")
    val uno = scala.io.StdIn.readInt()
    println("Second number PLEASE")
    val dos = scala.io.StdIn.readInt()
    println("Third number PLEASE")
    val tres = scala.io.StdIn.readInt()
    val largest = if (uno >= dos && uno >= tres)
      uno
    else if (dos >= uno && dos >= tres)
      dos
    else
      tres
    println(s"The largest number is $largest.")

  }
}