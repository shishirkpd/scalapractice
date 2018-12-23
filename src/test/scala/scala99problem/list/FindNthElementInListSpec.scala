package scala99problem.list

import org.scalatest.FlatSpec

class FindNthElementInListSpec extends FlatSpec {
  val findNthElementOfList = new FindNthElementInList()

  "FindNthElementInList.nthElement" should "return the nth element of the list" in {
    val list = (1 to 25).toList

    assert(findNthElementOfList.nthElement(15, list) == 16)
  }
  it should  "return the nth element of the char list" in {
    val list = ('a' to 'x').toList

    assert(findNthElementOfList.nthElement(0, list) == 'a')
  }

  it should "throw exception for the empty list" in {
    val list = List.empty

    assertThrows[NoSuchElementException]{
      findNthElementOfList.nthElement(15, list)
    }
  }
}
