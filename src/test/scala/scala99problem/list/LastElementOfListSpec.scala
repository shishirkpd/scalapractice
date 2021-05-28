package scala99problem.list

import org.scalatest.flatspec.AnyFlatSpec

class LastElementOfListSpec extends AnyFlatSpec {

  val lastElementOfList = new LastElementOfList()

  "List.last" should "return the last element of the list of integers" in {
    val list = (1 to 5).toList
    assert(lastElementOfList.last(list) == 5)
  }

  it should "return the last element of the list of char" in {
    val list = ('a' to 'e').toList
    assert(lastElementOfList.last(list) == 'e')
  }

  it should "return the last element of the list of int for one element in list" in {
    val list = List('a')
    assert(lastElementOfList.last(list) == 'a')
  }

  it should "throw  NoSuchElementException is list is Nil " in {
    val list = Nil
    assertThrows[NoSuchElementException] {
      lastElementOfList.last(list)
    }
  }

  it should "throw  NoSuchElementException is list is empty " in {
    assertThrows[NoSuchElementException] {
      lastElementOfList.last(List.empty)
    }
  }
}
