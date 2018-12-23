package scala99problem.list

class ReversTraversable {

  def reverse[A](list: List[A], acc: List[A]): List[A] = list match {
    case Nil => acc
    case head :: xs => reverse(xs, head +: acc)
  }

  def reverse[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case head :: xs => reverse(xs) :+ head
  }
}
