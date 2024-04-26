object pr20 {
  def main(args:Array[String]):Unit= {
    val x = 45
    if(x %9== 0 || x%5==0)
    {
      print("number is either divisible by 9 or 5")
    }
    else{
      print("number is not divisible by 9 or 5")
    }
  }
}