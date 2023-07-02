object Main {
  def main(args: Array[String]): Unit = {
    println("Type a character")
    val char = scala.io.StdIn.readLine().toLowerCase
    val vowels = Array("a","e","i","o","u")
    if(vowels.contains(char)) println("you entered a vowl")
    else {println("you entered a constant")}
  }
}