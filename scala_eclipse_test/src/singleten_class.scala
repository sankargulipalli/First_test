
object singleten_class {
   def mymethod(): Unit = {
    printf("Hello World")
    val int_list=List(1,2,3,4)
    println()
    println("Length of list is ="+int_list.length)
  }
  
  def main(args: Array[String]): Unit = {
    mymethod()
    
  }
}