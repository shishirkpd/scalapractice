package scala99problem.list

import org.scalatest.FlatSpec

class FindLengthOfListSpec extends FlatSpec {
  val findLengthOfList = new FindLengthOfList


  "FindLengthOfList.length" should "return the size for the given list" in {
    val list = 'a' to 'z' toList

    assert(findLengthOfList.length(list) == 26)
  }

  it should "return the size for the given list Integer" in {
    val list = 1 to 50 toList

    assert(findLengthOfList.length(list) == 50)
  }

  it should "return the 0 for the empty list" in {
    assert(findLengthOfList.length(List.empty) == 0)
  }
}
