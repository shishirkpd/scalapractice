def reverse[A](list: List[A], acc: List[A]): List[A] = list match {
  case Nil => acc
  case head :: xs => reverse(xs, head +: acc)
}

reverse((1 to 5).toList, Nil)