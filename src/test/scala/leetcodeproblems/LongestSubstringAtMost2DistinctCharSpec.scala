package leetcodeproblems

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class LongestSubstringAtMost2DistinctCharSpec extends AnyFlatSpec {

  val lsa = new LongestSubstringAtMost2DistinctChar

  it should "return 3 for the given string eceba" in {
    val input = "eceba"

    lsa.lengthOfLongestSubstringTwoDistinct(input) shouldBe 3
  }

  it should "return 3 for the given string aaa" in {
    val input = "aaa"

    lsa.lengthOfLongestSubstringTwoDistinct(input) shouldBe 3
  }


  it should "return 11 for the given string aaabbbbbbbb" in {
    val input = "aaabbbbbbbb"

    lsa.lengthOfLongestSubstringTwoDistinct(input) shouldBe 11
  }

  it should "return 14 for the given string aaabbbbbbbbcccccc" in {
    val input = "aaabbbbbbbbcccccc"

    lsa.lengthOfLongestSubstringTwoDistinct(input) shouldBe 14
  }

  it should "return 10 for the given string aaabbbbdbbbbcccccc" in {
    val input = "aaabbbbdbbbbcccccc"

    lsa.lengthOfLongestSubstringTwoDistinct(input) shouldBe 10
  }

}
