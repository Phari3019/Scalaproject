object pr18 {
  def main(args: Array[String]): Unit = {
    print("Enter your age: ")
    val age = scala.io.StdIn.readInt()
    if (age>60 && age<25) {
      println("Eligible for both a senior citizen discount and a student discount.")
    } else if (age>60) {
      println("Eligible for a senior citizen discount, but not a student discount.")
    } else if (age<25) {
      println("Eligible for a student discount, but not a senior citizen discount.")
    } else {
      println("Eligible for either a senior citizen discount or a student discount.")
    }
  }
}

