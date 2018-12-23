package scala99problem.list

class LastElementOfList {

  def lastElementWithTailRecursion[A](list: List[A]): A = list match {
    case head :: Nil => head
    case _ :: tail => lastElementWithTailRecursion(tail)
    case _  => throw new NoSuchElementException
  }
}
