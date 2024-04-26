object pr6 {
  def main(args: Array[String]): Unit = {
    print("Enter your age: ")

    val age = scala.io.StdIn.readInt()

    if (age >= 18) {
      println("You are eligible to vote.")
    } else {
      println("You are not eligible to vote.")
    }

    if (age >= 16) {
      println("You are eligible to drive.")
    } else {
      println("You are not eligible to drive.")
    }
  }
}

