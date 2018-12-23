package scala99problem.list

import org.scalatest.FlatSpec

class LastElementOfListSpec extends FlatSpec {

  val lastElementOfList = new LastElementOfList()

  "List.last" should "return the last element of the list of integers" in {
    val list = (1 to 5).toList
    assert(lastElementOfList.lastElementWithTailRecursion(list) == 5)
  }

  it should "return the last element of the list of char" in {
    val lastElementOfList = new LastElementOfList()
    val list = ('a' to 'e').toList
    assert(lastElementOfList.lastElementWithTailRecursion(list) == 'e')
  }

  it should "throw  NoSuchElementException is list is empty " in {
    val list = Nil
    assertThrows[NoSuchElementException] {
      lastElementOfList.lastElementWithTailRecursion(list)
    }
  }
}
