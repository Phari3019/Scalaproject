object pr16 {
  def main(args: Array[String]): Unit = {
    print("Enter your age: ")
    val age = scala.io.StdIn.readInt()
    val c = age < 13
    val t = age >= 13 && age <= 19
    val a = age >= 20
    if (c) {
      println("Child.")
    } else if (t) {
      println("Teenager.")
    } else if (a) {
      println("Adult.")
    } else {
      println("Invalid age.")
    }
  }
}

