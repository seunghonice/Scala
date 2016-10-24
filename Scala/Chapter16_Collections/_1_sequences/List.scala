package _1_sequences
import scala.collection.mutable.ArrayBuffer

class List {
  val buf = new ArrayBuffer[Int]
  val s = "Hello"
  val map = Map[String, Int]("haha" -> 1)
  
  def longestWord(words: Array[String]) = {
    var word = words(0)
    var index = 0
    for (i <- 1 until words . length) {
      if (words(i).length > word.length) {
        word = words(i)
        index = i
      }
    } 
    (word, index)
  }
}