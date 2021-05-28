package scala99problem.list

import org.scalatest.flatspec.AnyFlatSpec

class FindLengthOfListSpec extends AnyFlatSpec {
  val findLengthOfList = new FindLengthOfList


  "FindLengthOfList.length" should "return the size for the given list" in {
    val list = ('a' to 'z').toList

    assert(findLengthOfList.length(list) == 26)
  }

  it should "return the size for the given list Integer" in {
    val list = (1 to 50).toList

    assert(findLengthOfList.length(list) == 50)
  }

  it should "return the 0 for the empty list" in {
    assert(findLengthOfList.length(List.empty) == 0)
  }

  "FindLengthOfList.lengthWithFoldLeft" should "return the size for the given list" in {
    val list = ('a' to 'z').toList

    assert(findLengthOfList.lengthWithFoldLeft(list) == 26)
  }

  it should "return the 0 for the empty list" in {
    assert(findLengthOfList.lengthWithFoldLeft(List.empty) == 0)
  }
}
