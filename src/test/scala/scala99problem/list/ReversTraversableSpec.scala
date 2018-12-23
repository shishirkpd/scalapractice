package scala99problem.list

import org.scalatest.FlatSpec

class ReversTraversableSpec extends FlatSpec {

  val reversTraversable = new ReversTraversable

  "ReversTraversable.reverse" should "revers the given list" in {
    val list = List(1, 2, 3, 4, 5)
    val reverseList = List(5, 4, 3, 2, 1)

    assert(reversTraversable.reverse(list, Nil) == reverseList)
  }

  it should "revers the given list without tail recursion" in {
    val list = List(1, 2, 3, 4, 5)
    val reverseList = List(5, 4, 3, 2, 1)

    assert(reversTraversable.reverse(list) == reverseList)
  }

  it should "return Nil for the empty list" in {
    assert(reversTraversable.reverse(List.empty) == Nil)
  }

  it should "return Nil for the empty list for tail recursion" in {
    assert(reversTraversable.reverse(List.empty, Nil) == Nil)
  }

}
