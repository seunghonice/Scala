package variable_scope

object Main7 {
  def main(args: Array[String]) {
//	  printMultiTable()
    var filename = "haha"
    println(filename)
    println(if (!args.isEmpty) args(0) else "default.txt")
    val a = 1;
    {
	    val a = 2;
	    {
//	      println(a)
	    }
    }
    println(multiTable)
  } 
  def printMultiTable() {
    var i = 1
    while (i <= 10) {
      var j = 1
      while (j <= 10) {
        val prod = (i * j).toString
        var k = prod.length
        while (k < 4) {
          print(" ")
          k += 1
        }
        print(prod)
        j += 1
      }
      println
      i += 1
    }
  }
  // Returns a row as a sequence
  def makeRowSeq(row: Int) =
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " "  * (4 - prod.length)
      padding + prod
    }
  // Returns a row as a String
  def makeRow(row: Int) = makeRowSeq(row).mkString
  // Retuns table as a string with on row per line
  def multiTable() = { 
    val tableSeq = 
      for (row <- 1 to 10) yield makeRow(row)
    tableSeq.mkString("\n")
  }
  
}