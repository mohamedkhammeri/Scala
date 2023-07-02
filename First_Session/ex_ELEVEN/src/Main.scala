object Main extends App {
    println("Type a positive integer:")
    val number = scala.io.StdIn.readInt()
    if (isPrime(number)) {
      println(+number+" is prime.")
    } else {
      println(+number+" is not prime.")
    }
  def isPrime(n: Int): Boolean = {
    if (n <= 1) {
      false
    } else {
      var isPrime = true
      for (i <- 2 until n) {
        if (n % i == 0) {
          isPrime = false
        }
      }
      isPrime
    }
  }

}
