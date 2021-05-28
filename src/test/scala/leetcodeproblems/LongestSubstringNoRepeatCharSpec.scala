package leetcodeproblems

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class LongestSubstringNoRepeatCharSpec extends AnyFlatSpec {

  val lsnrc = new LongestSubstringNoRepeatChar
  it should "return the substring shir for shishir" in {
    val input = "shishir"
    lsnrc.findSubString(input) shouldBe "shir"
  }

  it should "return the substring abc for abcabcbb" in {
    val input = "abcabcbb"
    lsnrc.findSubString(input) shouldBe "abc"
  }

  it should "return the substring kew for pwwkew" in {
    val input = "pwwkew"
    lsnrc.findSubString(input) shouldBe "kew"
  }

  it should "return the substring vdf for dvdf" in {
    val input = "dvdf"
    lsnrc.findSubString(input) shouldBe "vdf"
  }

  it should "return the substring tablud for bbtablud" in {
    val input = "bbtablud"
    lsnrc.findSubString(input) shouldBe "tablud"
  }

  it should "return the substring cdd for cd" in {
    val input = "cdd"
    lsnrc.findSubString(input) shouldBe "cd"
  }

  it should "return the substring nfpdmpi for dmpi" in {
    val input = "nfpdmpi"
    lsnrc.findSubString(input) shouldBe "nfpdm"
  }

}

