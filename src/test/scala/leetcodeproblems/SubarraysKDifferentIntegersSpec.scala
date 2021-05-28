package leetcodeproblems

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class SubarraysKDifferentIntegersSpec extends AnyFlatSpec {
  val subKDInt = new SubarraysKDifferentIntegers

  it should "return 7 for the input array [1,2,1,2,3], k = 2" in {
    val inputArray = Array(1,2,1,2,3)
    val k = 2
    val res = subKDInt.newSub(inputArray, k)
    res shouldBe 7
  }

  it should "return 3 for the input array [1,2,1,3,4], k = 3" in {
    val inputArray = Array(1,2,1,3,4)
    val k = 3
    val res = subKDInt.subarraysWithKDistinct(inputArray, k)
    res shouldBe 3
  }
}
