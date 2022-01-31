package algoexpert

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class TwoNumberSumInArraySJSpec extends AnyFlatSpec {

  val twoNumberSumInArray = new TwoNumberSumInArrayJ()
  val twoNumberSumInArrayS = new TwoNumberSumInArrayS

  it should "return [11, -1] for the given array = [3, 5, -4, 8, 11, 1, -1, 6]" in {
    val input = Array(3, 5, -4, 8, 11, 1, -1, 6)
    val expected = Array(11, -1)
    val result1 = twoNumberSumInArray.twoNumberSum(input, 10)
    val result2 = twoNumberSumInArrayS.sumOfTwoNumberEqualTarget(input, 10)

    result1 shouldBe expected
    result2 shouldBe expected
  }


  it should "return [11, -1] for the given array = [3, 5, -4, 8, 5, 1, -1, 6]" in {
    val input = Array(3, 5, -4, 8, 5, 1, -1, 6)
    val expected = Array(5, 5)
    val result1 = twoNumberSumInArray.twoNumberSum(input, 10)
    val result2 = twoNumberSumInArrayS.sumOfTwoNumberEqualTarget(input, 10)
    result1 shouldBe expected
    result2 shouldBe expected
  }

}
