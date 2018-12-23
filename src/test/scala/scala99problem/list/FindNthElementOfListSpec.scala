package scala99problem.list

import org.scalatest.FlatSpec

class FindNthElementOfListSpec extends FlatSpec {

  val findNthElementOfList = new FindNthElementOfList()

  "FindNthElementOfListTest.nthElement" should "return the nth element in the list of int" in {
    val list = 1 to 15 toList

    assert(findNthElementOfList.lastNthElement(list, 7) == 9)
  }
  it should "return the nth element in the list of char" in {
    val list = 'a' to 'd' toList

    assert(findNthElementOfList.lastNthElement(list, 3) == 'b')
  }

  it should "return the exception for one element in list" in {
    val list = List(1)

    assertThrows[NoSuchElementException] {
      findNthElementOfList.lastNthElement(list, 2)
    }
  }


}
