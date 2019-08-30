import scala.collection.mutable.ListBuffer


object singleten_class {
   def mymethod(): Unit = {
    printf("Hello World")
    val int_list=List(1,2,3,4)
    int_list.foreach(x=>println(x+1))
    val int_list_buf=ListBuffer(6,7,8,9)
    println("Adding the value 10 to list_buffer")
    int_list_buf+=10
    int_list_buf.foreach(println)
    println("delete the item 5 from list_buffer")
    int_list_buf-=5
    int_list_buf.foreach(println)
    val int_set=Set(12,45,45,7,8,89,89,62)
    println("we have added the new set to eleminated the duplicated values")
    int_set.foreach(println)
    print("new update")
     
    println("Length of list is="+int_list.length)
  }
  
  def main(args: Array[String]): Unit = {
    mymethod()
    
  }
}