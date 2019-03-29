

object val_count {
  
def count_vally(): Unit = {
var i = 0
var groud = -1
var vally = 0
var ar = Array('U','D','D','D','D','U','U','U')
//val ar = list_val.toArray

while(i<=ar.length)
 {
  if(groud==0)
   {
    vally+=1
   }
   if(ar(i)=='U')
    {
     groud+=1
    }
   else
    { 
      groud+=1
     }
   i+=1
 }
println(vally)  
}
def main(args: Array[String]): Unit = {
    count_vally()
    
 }
  
}