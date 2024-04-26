object pr12 {
  def prim(number: Int): Boolean ={
    if (number <= 1) {
      return false
    }
    if (number % 2 == 0) {
      return false
    }
    val sqrt = math.sqrt(number).toInt
    for (i <- 3 to sqrt by 2) {
      if (number % i == 0) {
        return false
      }
    }
    return true
  }
  def main(args: Array[String]): Unit = {
    val num1 = 17
    println(s"$num1 is both prime and odd: ${prim(num1)}")
  }
}


