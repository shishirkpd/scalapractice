package extraProblems

class Factorial {

  def factorial(n: Int): Int = n match {
    case 0 => 1
    case x => x * factorial(x -1)
  }

  def factorialTailRec(num: Int): Int = {
    def factHelper(num: Int, res: Int): Int = num match {
      case 0 => res
      case x => factHelper(x -1, res * x)
    }
    factHelper(num, 1)
  }
}
