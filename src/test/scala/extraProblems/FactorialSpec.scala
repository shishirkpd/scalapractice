package extraProblems

import org.scalatest.FlatSpec

class FactorialSpec extends FlatSpec {

  val fact = new Factorial

  it should "return the factorial for given number" in {
    assert(fact.factorial(1) == 1)
    assert(fact.factorialTailRec(1) == 1)
    assert(fact.factorial(5) == 120)
    assert(fact.factorialTailRec(5) == 120)
  }

}
