object pr9 {
  def main(args: Array[String]): Unit = {
    print("Enter age: ")
    val age = scala.io.StdIn.readInt()
    if (age > 60) {
      println("Eligible for a senior citizen discount.")
    } else {
      println("Not eligible for a senior citizen discount.")
    }
    if (age < 25) {
      println("Eligible for a student discount.")
    } else {
      println("Not eligible for a student discount.")
    }
  }
}
