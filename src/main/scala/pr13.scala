object pr13
{
  def main(args: Array[String]): Unit = {
    print("Enter the purchase amount: ")
    val i = scala.io.StdIn.readDouble()
    if (i > 150) {
      println("Eligible for a discount.")
    } else {
      println("Not eligible for a discount.")
    }
    if (i > 100) {
      println("Qualify for free shipping.")
    } else {
      println("No free shipping.")
    }
  }
}

