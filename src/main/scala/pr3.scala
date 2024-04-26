object pr3 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val inputNumber = scala.io.StdIn.readLine()
    val number = inputNumber.toDouble
    if (number < -10 || number > 10) {
      println(s"$number is either less than -10 or greater than 10")
    } else {
      println(s"$number is between -10 and 10")
    }
  }
}
