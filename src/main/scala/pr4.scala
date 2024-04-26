object pr4 {
  def main(args:Array[String]):Unit= {
    val x = 27
    if(x %2!= 0 && x%3!=0)
      {
        print("number is odd and not divisible by 3")
      }
      else{
        print("number is even or divisible by 3")
      }
  }
}
