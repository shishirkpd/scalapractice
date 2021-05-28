package leetcodeproblems

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class TwoSumSpec extends AnyFlatSpec {

  val twoSum = new TwoSum

  it should "return position of number whos sum is target 9 number" in {
    val intArray = Array(2,7,11,15)
    val targetNumber = 9

    val res = twoSum.findPositionForTarget(intArray, targetNumber)

    res shouldBe Array(0,1)
  }

  it should "return position of number whos sum is target 5number" in {
    val intArray = Array(4,3,2,4)
    val targetNumber = 5

    val res = twoSum.findPositionForTarget(intArray, targetNumber)

    res shouldBe Array(1,2)
  }

  it should "return position of number whos sum is target 6 number" in {
    val intArray = Array(3,3)
    val targetNumber = 6

    val res = twoSum.twoSum(intArray, targetNumber)

    res shouldBe Array(0,1)
  }

  it should "return position of number whos sum is target 6 for Array(3,2,3) number" in {
    val intArray = Array(3,2,3)
    val targetNumber = 6

    val res = twoSum.findPositionForTarget(intArray, targetNumber)

    res shouldBe Array(0,2)
  }

}
