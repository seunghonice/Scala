package try_catch

object Main4 {
	def main(args: Array[String]) {
		val n = readInt()
				val half =
				if (n % 2 == 0)
					n / 2
					else 
						throw new RuntimeException("n must be even")

						//    import java.io.FileReader
						//    import java.io.FileNotFoundException
						//    import java.io.IOException
						//    try {
						//      val file = new FileReader("input.txt")
						//    } catch {
						//      case ex: FileNotFoundException => println(ex)
						//      case ex: IOException => println(ex)
						//    }
						//    
						//    val file = new FileReader("input.txt")
						//    try {
						//      // Use file..
						//    } finally {
						//      file.close
						//    }
	}
	def f(): Int = { 
			try {
				return 1
			} finally {
				println("Finally..")
				return 2
			}
	}
	println(f)

	import java.net.URL
	import java.net.MalformedURLException
	def urlFor(path: String) = {
		try {
		  new URL(path)
		} catch {
		  case e: MalformedURLException =>
		  new URL("http://www.scala-lang.org")
		}
	}
}
