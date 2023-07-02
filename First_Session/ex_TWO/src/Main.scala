object Main {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val uno = scala.io.StdIn.readInt()
    if (uno > 0) {printf(" %d is postive",uno)}
    else if(uno < 0) {printf(" %d is negative",uno)}
    else {printf(" The number is 0")}


  }
}