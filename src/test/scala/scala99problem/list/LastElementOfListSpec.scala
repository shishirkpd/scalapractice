package scala99problem.list

import org.scalatest.FlatSpec

class LastElementOfListSpec extends FlatSpec{

  val lastElementOfList = new LastElementOfList()

  "List.last" should "return the last element of the list of integers" in {
    val list = (1 to 5).toList
    assert(lastElementOfList.lastElementWithTailRecursion(list) == 5)
  }
}
