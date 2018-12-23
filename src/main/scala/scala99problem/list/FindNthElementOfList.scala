package scala99problem.list

class FindNthElementOfList {
  def lastNthElement[A](list: List[A], lastNth: Int): A = list match {
    case tail if tail.length == lastNth => tail.head
    case _ :: tail => lastNthElement(tail, lastNth)
    case _ => throw new NoSuchElementException
  }
}
