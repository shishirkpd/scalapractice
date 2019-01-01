package scala99problem.list

class RemoveConsecutiveDuplicate {

  def compress[T](listWithConsecutiveDuplicate: List[T]): List[T] = listWithConsecutiveDuplicate match {
    case Nil => Nil
    case h :: List() => List(h)
    case h :: tail if (h == tail.head) => compress(tail)
    case h :: tail => h :: compress(tail)
  }

  def compressWithFold[A](l: List[A]): List[A] = l.foldRight(List[A]()) {
    case (e, ls) if (ls.isEmpty || ls.head != e) => e::ls
    case (_, ls) => ls
  }
}
