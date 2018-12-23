package scala99problem.list

class FindNthElementInList {

  def nthElement[A](nth: Int, list: List[A]): A = (nth, list) match {
    case (0, head::_) => head
    case (n, _::tail) if n > 0 => nthElement(n - 1, tail)
    case _ => throw new NoSuchElementException
  }
}
