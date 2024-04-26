object pr17 {
  def main(args:Array[String]):Unit= {
    val x = 25
    if(x %2== 0 || x%5==0)
    {
      print("number is either divisible by 2 or 5")
    }
    else{
      print("number is not divisible by 2 or 5")
    }
  }
}