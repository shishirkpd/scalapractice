package scala99problem.list

import org.scalatest.FlatSpec

class PackConsecutiveElementsSpec extends FlatSpec {

  val packConsecutiveElements = new PackConsecutiveElements

  "PackConsecutiveElements.packWithFold" should "return the list with the next consecutive element in one list" in {

    val input = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val outPut =  List(List('a', 'a', 'a', 'a'), List('b'), List('c', 'c'), List('a', 'a'), List('d'), List('e', 'e', 'e', 'e'))

    assert(packConsecutiveElements.packWithFold(input) == outPut)
  }

  "PackConsecutiveElements.packWithTailRecursion" should "return the list with the next consecutive element in one list" in {

    val input = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val outPut =  List(List('a', 'a', 'a', 'a'), List('b'), List('c', 'c'), List('a', 'a'), List('d'), List('e', 'e', 'e', 'e'))

    assert(packConsecutiveElements.packWithTailRecursion(input) == outPut)
  }

  "PackConsecutiveElements.packWithTailRecursionAndSpan" should "return the list with the next consecutive element in one list" in {

    val input = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val outPut =  List(List('a', 'a', 'a', 'a'), List('b'), List('c', 'c'), List('a', 'a'), List('d'), List('e', 'e', 'e', 'e'))

    assert(packConsecutiveElements.packWithTailRecursionAndSpan(input) == outPut)
  }



}
