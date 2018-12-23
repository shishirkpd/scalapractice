package scala99problem.list

class LastElementOfList {

  def last[A](list: List[A]): A = list match {
    case head :: Nil => head
    case _ :: tail => last(tail)
    case _  => throw new NoSuchElementException
  }
}
