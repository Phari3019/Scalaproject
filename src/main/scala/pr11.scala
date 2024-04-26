object pr11 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val x = scala.io.StdIn.readInt()
    if (x >= 0 || x % 2 == 0) {
      println(s"$x is either non-negative or even.")
    } else {
      println(s"$x is neither non-negative nor even.")
    }
  }
}

