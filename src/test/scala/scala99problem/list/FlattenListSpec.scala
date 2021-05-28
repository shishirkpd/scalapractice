package scala99problem.list

import org.scalatest.flatspec.AnyFlatSpec

class FlattenListSpec extends AnyFlatSpec {
   val flattenList = new FlattenList

  "FlattenList.flatten" should "return a list contain of all element for list of list" in {
    val listOfList = List(1,2, List(3, 4, 5, List(6, 7), 8))

    assert(flattenList.flatten(listOfList) == List(1, 2, 3, 4, 5, 6, 7, 8))
  }

  it should "return a Nil for the empty list" in {

    assert(flattenList.flatten(List.empty) == Nil)
  }


}
