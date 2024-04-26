object pr21 {
  def main(args:Array[String]):Unit= {
    val x = 15
    if(x %2!= 0 || x%4!=0)
    {
      print("number is odd and not divisible by 4")
    }
    else{
      print("number is even or divisible by 4")
    }
  }
}
