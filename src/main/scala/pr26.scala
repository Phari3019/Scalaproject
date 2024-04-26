object pr26 {
  def main(args: Array[String]): Unit = {
    print("Enter age: ")
    val age = scala.io.StdIn.readInt()
    print("New customer? (true/false): ")
    val nc = scala.io.StdIn.readLine().toLowerCase == "true"
    if (age > 65 && !nc) {
      println("Eligible for a senior citizen discount.")
    } else {
      println("Not eligible for a senior citizen discount.")
    }
  }
}
