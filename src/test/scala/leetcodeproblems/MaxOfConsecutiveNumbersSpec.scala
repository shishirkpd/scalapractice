package leetcodeproblems

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class MaxOfConsecutiveNumbersSpec extends AnyFlatSpec {

  val maxOfConsecutiveNumbers = new MaxOfConsecutiveNumbers
  it should "return the greatest sum of two consecutive number" in {
    val array = Array(3, 3)
    maxOfConsecutiveNumbers.getIndexOfGreatestSum(array) shouldBe (0,1)
  }

  it should "return the greatest sum of two consecutive number for given array" in {
    val array = Array(3, 3, 5, 0 , 9)
    maxOfConsecutiveNumbers.getIndexOfGreatestSum(array) shouldBe (3,4)
  }
}
