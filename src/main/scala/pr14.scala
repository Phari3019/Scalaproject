object pr14 {
  def main(args:Array[String]):Unit= {
    val x = 24
    if(x %3== 0 || x%8==0)
    {
      print("number is either divisible by 3 or 8")
    }
    else{
      print("number is not divisible by 3 or 8")
    }
  }
}
