package without_break_and_continue

object Main6 {
	def main(args: Array[String]) = {
		var i = 0;
		var foundIt = false
		while (i < args.length && !foundIt) {
			if (args(i).startsWith("-")) {
				if (args(i).endsWith(".scala")) {
					foundIt = true;
				}
			}
    	i += 1
		}
		
		import scala.util.control.Breaks._
		import java.io._
		val in = new BufferedReader(new InputStreamReader(System.in))
		breakable {
		  while (true) {
		    println("? ")
		    if (in.readLine() == "") break
		  }
		}
	}
	def searchFrom(i: Int, args: Array[String]): Int = {
	  if (i >= args.length) -1
	  else if (args(i).startsWith("-")) searchFrom(i + 1, args)
	  else if (args(i).endsWith(".scala")) i
	  else searchFrom(i + 1, args)
	}
	 val i = searchFrom(0, Array("-e", "-a.sa", "g.scala"))
	 println(i)
}