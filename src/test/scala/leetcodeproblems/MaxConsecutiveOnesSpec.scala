package leetcodeproblems

import org.scalatest.flatspec.AnyFlatSpec


class MaxConsecutiveOnesSpec extends AnyFlatSpec {

  val maxC = new MaxConsecutiveOnes
  it should "return the sum as 3 for given list" in {
    assert(maxC.findMaxConsecutiveOnes(Array(1,1,0,1,1,1)) == 3)
  }

  it should "return the sum as 3 for given list for another list" in {
    assert(maxC.findMaxConsecutiveOnes(Array(1,1,0,1,1,1, 0, 1, 0, 1,1,1,1,1, 0)) == 5)
  }
}
