object pr8 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val x = scala.io.StdIn.readInt()
    if (x < 0 && x % 2 != 0) {
      println(s"$x is both negative and odd.")
    } else {
      println(s"$x is not negative and odd.")
    }
  }
}