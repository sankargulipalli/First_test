object read_input
{
  def read_method():Unit = {
    println("Enter the input value:")
    
    val input= scala.io.StdIn.readLine()
    println(input)
  }
   def main(args: Array[String]): Unit = {
    read_method()
    
  }
}