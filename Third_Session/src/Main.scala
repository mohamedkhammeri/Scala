object Main {
  def main(args: Array[String]): Unit = {
    class Person(val name: String, val age: Int, val email: String) {
      def greet(): Unit = {
        println(s"Hola me llamo $name y tengo $age años.")
      }
    }

    // Expl
    val person = new Person("Mohamed", 28, "attack@titan.levy")
    person.greet()


    class Rectangle(val length: Double, val width: Double) {
      def calculateArea(): Double = {
        length * width
      }

      def calculatePerimeter(): Double = {
        2 * (length + width)
      }
    }

    // Example usage:
    val rectangle = new Rectangle(6, 3)
    val area = rectangle.calculateArea()
    val perimeter = rectangle.calculatePerimeter()
    println(s"The area of the rectangle is: $area")
    println(s"The perimeter of the rectangle is: $perimeter")


    class BankAccount(val accountNumber: String, var balance: Double) {
      def deposit(amount: Double): Unit = {
        if (amount > 0) {
          balance += amount
          println(s"Successfully deposited $$$amount. New balance: $$$balance")
        } else {
          println("Only positive values")
        }
      }

      def withdraw(amount: Double): Unit = {
        if (amount > 0) {
          if (amount <= balance) {
            balance -= amount
            println(s"Withdrew $$$amount. New balance: $$$balance")
          } else {
            println("Insufficient balance.")
          }
        } else {
          println("Only a positive value.")
        }
      }
    }

    // Expl
    val account = new BankAccount("11223388", 0.0)
    account.deposit(850.0)
    account.withdraw(30.0)

  }
}