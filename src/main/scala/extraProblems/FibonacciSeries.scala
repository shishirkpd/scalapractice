package extraProblems

import scala.collection.immutable.Stream.cons

class FibonacciSeries {
  //recursion
  def fibonacciSeries(n: Int): Int = n match {
    case 0 | 1 => n
    case n => fibonacciSeries(n-1) + fibonacciSeries(n-2)
  }

  //tail recursion
  def fibtail(n : Int) : Int = {
    def fib_tail( n: Int, a:Int, b:Int): Int = n match {
      case 0 => a
      case _ => fib_tail( n-1, b, a + b )
    }
    fib_tail(n, 0, 1)
  }

  //using stream
  def createFiboSeries(a: Int, b: Int): Stream[Int] =
    cons(a, createFiboSeries(b, a+b))

}
