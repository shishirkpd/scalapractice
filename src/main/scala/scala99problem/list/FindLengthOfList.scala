package scala99problem.list

class FindLengthOfList {

  def length[A](list: List[A]): Int = list match {
    case Nil => 0
    case _ :: tail => lengthN(tail, 1)
  }

  def lengthWithFoldLeft[A](list: List[A]): Int = list.foldLeft(0){(c, _) => c + 1}

  private def lengthN[A](list: List[A], count: Int): Int = list match {
    case Nil => count
    case _ :: tail => lengthN(tail, count + 1)
  }
}
