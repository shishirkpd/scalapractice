package extraProblems

import org.scalatest.flatspec.AnyFlatSpec

class FibonacciSeriesSpec extends AnyFlatSpec {

  val fib = new FibonacciSeries

  it should "return the fibonacci series for given number" in {
    assert(fib.fibonacciSeries(2) == 1)
  }

  it should "return the fibonacci numbers for given number for tail recursion method" in {
    assert(fib.fibtail(3) == 2)
  }

  it should "return the  list fibonacci numbers for given number with stream " in {
    val myFiboSeries = fib.createFiboSeries(0, 1)
    assert(myFiboSeries.take(5).toList == List(0, 1, 1, 2 , 3))
  }
}
