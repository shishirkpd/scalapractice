package interviewReady

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class SumOfConsecutiveNumberEqualGivenNumberSpec extends AnyFlatSpec {

  val sumOfConsecutiveNumberEqualGivenNumber = new SumOfConsecutiveNumberEqualGivenNumber

  it should "return 2 for 100 as there are two possibilities to add n consecutive number to sum 100" in {
    sumOfConsecutiveNumberEqualGivenNumber.findWaysToSumNumber(100) shouldBe 2
    sumOfConsecutiveNumberEqualGivenNumber.recFindWaysToSumNumber(100) shouldBe 2
  }

  it should "return 1 for 10 as there are two possibilities to add n consecutive number to sum 10" in {
    sumOfConsecutiveNumberEqualGivenNumber.findWaysToSumNumber(10) shouldBe 1
    sumOfConsecutiveNumberEqualGivenNumber.recFindWaysToSumNumber(10) shouldBe 1
  }

  it should "return 3 for 15 as there are two possibilities to add n consecutive number to sum 15" in {
    sumOfConsecutiveNumberEqualGivenNumber.findWaysToSumNumber(15) shouldBe 3
    sumOfConsecutiveNumberEqualGivenNumber.recFindWaysToSumNumber(15) shouldBe 3
  }
}
