package scala99problem.list

class ListPalindromeCheck {
  def isPalindrome[A](list: List[A]): Boolean = {
      def _palindrome(res: Boolean, remList: List[A]): Boolean = remList match {
        case Nil => res
        case frl(first, last, rem) => _palindrome(res && first == last, rem)
      }

      _palindrome(true, list)
  }

}

/***
  * This object is an extractor which extract the list and divide into
  * 3 parts head tail and the remaining list
  * example:
  * val frl(head, tail, remainingList) = List(1,2,3,4,5)
  * head: Int = 1
  * tail: Int = 5
  * remainingList: List[Int] = List(2, 3, 4)
  */

object frl {
  def unapply[A] (l: List[A]): Option[(A, A, List[A])] = l match {
    case Nil => None
    case l if (l.length == 1) => Some(l.head, l.last, List())
    case l => Some(l.head, l.last, l.init.tail)
  }
}
