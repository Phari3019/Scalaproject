object pr15 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val i = scala.io.StdIn.readInt()
    if (i <= 0 && i % 2 == 0) {
      println(s"$i is both non-positive and even.")
    } else {
      println(s"$i is not both non-positive and even.")
    }
  }
}
