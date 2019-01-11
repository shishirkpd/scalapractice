package scala99problem.list

class PackConsecutiveElements {
  def packWithFold[T](list: List[T]): List[List[T]] = {
    list.foldLeft(List(List.empty[T])){
      (res, ele) => if(res.last.nonEmpty && res.last.last == ele) {
        res.init ::: List(res.last :+ ele)
      } else {
        res ::: List(List(ele))
      }
    }.filter(_.nonEmpty)
  }

  def packWithTailRecursion[A](l: List[A]): List[List[A]] = {
    def _pack(res: List[List[A]], rem: List[A]): List[List[A]] = rem match {
      case Nil => res
      case h::tail if (res.isEmpty || res.last.head != h) => _pack(res ::: List(List(h)), tail)
      case h::tail => _pack(res.init ::: List(res.last ::: List(h)), tail)
    }
    _pack(List.empty,l)
  }

  def packWithTailRecursionAndSpan[A](l: List[A]): List[List[A]] = {
    def _pack(res: List[List[A]], rem: List[A]): List[List[A]] = rem match {
      case Nil => res
      case ls => {
        val (s: List[A], r: List[A]) = rem span { _ == rem.head }
        _pack(res ::: List(s), r)
      }
    }
    _pack(List.empty, l)
  }
}
