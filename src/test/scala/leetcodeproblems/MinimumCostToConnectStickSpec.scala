package leetcodeproblems

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class MinimumCostToConnectStickSpec extends AnyFlatSpec {

  val mctcs = new MinimumCostToConnectStick

  it should "return 14 for given input list of number [2,4,3]" in {
    val input = List(2,4,3)

    mctcs.MinimumCost(input) shouldBe 14
  }

  it should "return 30 for given input list of number [1,8,3,5]" in {
    val input = List(1,8,3,5)

    mctcs.MinimumCost(input) shouldBe 30
  }
}
