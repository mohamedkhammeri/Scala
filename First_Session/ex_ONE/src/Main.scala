object Main {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val uno = scala.io.StdIn.readInt()
    print("Another ONE: ")
    val dos = scala.io.StdIn.readInt()
    if (uno > dos) {printf(" is larger than %d",uno,dos)}
    else {printf("%d is larger than %d",dos,uno)}


  }
}