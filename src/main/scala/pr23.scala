object pr23 {
  def main(args: Array[String]): Unit = {
    print("Enter the purchase amount: ")
    val p = scala.io.StdIn.readDouble()
    print("Do you have a loyalty card? (true/false): ")
    val l = scala.io.StdIn.readLine().toLowerCase == "true"
    val q = l
    if (p>200) {
      println("Eligible for a discount.")
    } else {
      println("Not eligible for a discount.")
    }
    if (q) {
      println("Qualified for membership benefits.")
    } else {
      println("Do not qualify for membership benefits.")
    }
  }
}
