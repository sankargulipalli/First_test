object read_input
{
  def read_method():Unit = {
    //println("Enter the input value:")
    
    val n= scala.io.StdIn.readLine("Please enter the nuber for n: ").toInt
    var i=1
    var color_list= scala.collection.mutable.ListBuffer.empty[Int]
    
    //color_list+=5
    //color_list+=7
    //println(color_list)
    while(i<=n)
    {
    color_list += scala.io.StdIn.readLine("Please enter the colors number: ").toInt
    i+=1
   
    }
    printf("color_list:"+ color_list)
    
  }
   def main(args: Array[String]): Unit = {
    read_method()
    
  }
}