
object Main extends App {
  println("Enter a three-digit number:")
  val num = scala.io.StdIn.readInt()

  def isArmstrongNumber(n: Int): Boolean = {
    val digit1 = n / 100
    val digit2 = (n / 10) % 10
    val digit3 = n % 10

    val sumOfCubes = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2) + (digit3 * digit3 * digit3)
    sumOfCubes == n
  }

  if (isArmstrongNumber(num)) {
    println(+num+" is an Armstrong number.")
  } else {
    println(+num+" is not an Armstrong number.")
  }
}
