package scala99problem.list

import org.scalatest.flatspec.AnyFlatSpec

class RemoveConsecutiveDuplicateSpec extends AnyFlatSpec {

  val removeConsecutiveDuplicate = new RemoveConsecutiveDuplicate

  "RemoveConsecutiveDuplicate.compress" should "remove the consecutive duplicate element for the list" in {

    val listWithConsecutiveDuplicate = List(1, 2, 2, 3, 4, 1, 5, 5)

    assert(removeConsecutiveDuplicate.compress(listWithConsecutiveDuplicate) == List(1, 2, 3, 4, 1, 5))
  }

  it should "remove the consecutive duplicate element for the list with any type of element" in {

    val listWithConsecutiveDuplicate = List(1, 'a', 'a', 3, 4, 'b', 5, 5, 'b')

    assert(removeConsecutiveDuplicate.compress(listWithConsecutiveDuplicate) == List(1, 'a', 3, 4, 'b', 5, 'b'))
  }

  it should "remove the consecutive duplicate element for the list with any type of element with fold" in {

    val listWithConsecutiveDuplicate = List(1, 'a', 'a', 3, 4, 'b', 5, 5, 'b')

    assert(removeConsecutiveDuplicate.compressWithFold(listWithConsecutiveDuplicate) == List(1, 'a', 3, 4, 'b', 5, 'b'))
  }

}
