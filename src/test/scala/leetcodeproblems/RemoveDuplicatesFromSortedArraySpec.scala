package leetcodeproblems

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class RemoveDuplicatesFromSortedArraySpec extends AnyFlatSpec {

  val removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray


  it should "return 2 for given array [1,1,2]" in {
    val input = Array(1,1,2)
    removeDuplicatesFromSortedArray.removeDuplicates(input) shouldBe 2
  }

  it should "return 5 for given array [0,0,1,1,1,2,2,3,3,4]" in {
    val input = Array(0,0,1,1,1,2,2,3,3,4)
    removeDuplicatesFromSortedArray.removeDuplicates(input) shouldBe 5
  }
}
