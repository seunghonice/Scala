package while_loops

object Main2 {
  def main(args: Array[String]): Unit = {
    
    println(gcdLoop(34697,155))
    
//    var line = ""
//    do {
//      line = readLine() // read line from standard input
//      println("Read: "+ line)
//    }while (line != "")
   println(greet == ()) 
  
   var line = ""
   while ((line = readLine()) != "")
     println("Read: " + line)
     
  }
  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }
  def gcd(x: Long, y: Long): Long = 
    if (y == 0) x else gcd(y, x % y)
    
  def greet() {println("hi")}
  
  
}