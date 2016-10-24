package for_expressions

object Main3 {
  val filesHere = new java.io.File(".").listFiles
  def main(args: Array[String]) {
    
    // Generator
    val filesHere = new java.io.File(".").listFiles
    for (file <- filesHere)
      println(file)
      
    // Range - to
//    for (i <- 1 to 4)
//      println("Iteration " + i)
      
    // Range - Until
//    for (i <- 1 until 4)
//      println("Iteration " + i)
//    for (i <- 0 until filesHere.length)
//      println(filesHere(i))
      
    // Filtering
//    val filesHere = (new java.io.File(".")).listFiles
//    for (file <- filesHere if file.getName.endsWith(".scala"))
//      println(file)
//    
//    for (file <- filesHere)
//      if (file.getName.endsWith(".scala"))
//        println(file)
//    for (
//        file <- filesHere
//        if file.isFile
//        if file.getName.endsWith(".scala")
//    ) println(file)
  }
  def fileLines(file: java.io.File) = 
    scala.io.Source.fromFile(file).getLines().toList
//  def grep(pattern: String) =
//    for (
//        file <- filesHere
//        if file.getName.endsWith(".scala");
//        line <-fileLines(file)
//        if line.trim.matches(pattern)
//    ) println(file + ": "+ line.trim)

    // Mid-stream variable bindings
//    def grep(pattern: String) =
//      for (
//        file <- filesHere
//        if file.getName.endsWith(".scala");
//        line <- fileLines(file);
//        trimmed = line.trim
//        if trimmed.matches(pattern)
//      ) println(file + ": " + trimmed)
//  def grep(pattern: String) =
//    for {
//    	file <- filesHere
//    	if file.getName.endsWith(".scala")
//    	line <- fileLines(file)
//    	trimmed = line.trim
//    	if trimmed.matches(pattern)
//  } println(file + ": " + trimmed)
//    grep(".*gcd.*")
  
  // Producing a new collection
  def scalaFiles =
//    for {
//        file <- filesHere
//        if file.getName.endsWith(".scala")
//    } yield file
    
    for {
        file <- filesHere
        if file.getName.endsWith(".scala")
        line <- fileLines(file)
    } yield {
        line.trim
    }
  //Transforming an Array[File] to Array[Int]
  val forLineLengths =
    for {
      file <- filesHere // filesHere: Array[File]
      if file.getName.endsWith(".scala")
      line <- fileLines(file) // fileLines(file): Iterator[String] 
      trimmed = line.trim
      if trimmed.matches(".*for.*")
    } yield trimmed.length // trimmed.length'set: Array[Int]
    
}
