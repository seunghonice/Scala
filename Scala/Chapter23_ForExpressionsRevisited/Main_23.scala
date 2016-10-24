case class Person(name: String, isMale: Boolean, children: Person*)

object Main_23 {
  def main(args: Array[String]) {
    val lara = Person("Lara", false)
    val bob = Person("Bob", true)
    val julie = Person("Julie", false, lara, bob)
    val persons = List(lara, bob, julie)
    
    val n = for (
      p <- persons;
      n = p.name
      if (n startsWith "la")
    ) yield n
    println(n)
    
    case class Book(title: String, authors: String*)
    val books: List[Book] = 
      List(
          Book(
              "Structure and Interpretation of Computer Programs",
              "Abelson, Harold", "Sussman, Gerald J."
              ),
          Book(  
              "Principles of Compiler Design",
              "Aho, Alfred", "Ullman, Jeffrey"
              ),
          Book(
              "Programming in Modula-2",
              "Wirth, Niklaus"
          ),
          Book(
              "Elements of ML Programming",
              "Ullman, Jeffrey"
          ),
          Book(
              "The Java Language Specification", "Gosling, James",
              "Joy, Bill", "Steele, Guy", "Bracha, Gilad"
          )
      )
    abstract class C[A] {
      def map[B](f: A => B) : C[B]
      def flatMap[B](f: A => C[B]): C[B]
      def withFilter(p: A => Boolean): C[A]
      def foreach(b: A => Unit): Unit
    }
  }
}