object Main {
  def main(args: Array[String]): Unit = {
    println("How old ?")
    val age = scala.io.StdIn.readInt()
    if(age>=18){println("You are an adult")}
    else {println("You are a minor")}
  }
}
