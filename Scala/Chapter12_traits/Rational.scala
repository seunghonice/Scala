//class Rational(val numer: Int, val denom: Int) {
//  // ...
//  def < (that: Rational) =
//    this.numer * that.denom < that.numer * this.denom
//  def > (that: Rational) = that < this
//  def <= (that: Rational) = (this < that) || (this == that)
//  def >= (that: Rational) = (this > that) || (this == that)
//}

class Rational(val numer: Int, val denom: Int) extends Ordered[Rational] {
  // ...
  def compare (that:Rational) =
    (this.numer * that.denom) - (that.numer * this.denom)
}