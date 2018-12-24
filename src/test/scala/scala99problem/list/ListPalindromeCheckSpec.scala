package scala99problem.list

import org.scalatest.FlatSpec

class ListPalindromeCheckSpec extends FlatSpec {

  val listPalindromeCheck = new ListPalindromeCheck

  "ListPalindromeCheck.isPalindrome" should "return true for the give palindrome list" in {
    val list = List(1, 2, 3, 4 , 3, 2, 1)
    assert(listPalindromeCheck.isPalindrome(list) == true)
  }

  it should "return false for the give non palindrome list" in {
    val list = List(1, 2, 3, 4 , 2, 3, 1)
    assert(listPalindromeCheck.isPalindrome(list) == false)
  }

  it should "return true for the empty list" in {
    assert(listPalindromeCheck.isPalindrome(List.empty) == true)
  }
}
