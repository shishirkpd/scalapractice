package leetcodeproblems

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class MedianOfTwoSortedArraysSpec extends AnyFlatSpec {

  val mOf2SortedArray = new MedianOfTwoSortedArrays

  it should "return 2.5 as result of given Array(1,2), Array(3,4)" in {
    val input1 = Array(1,2)
    val input2 = Array(3,4)

    mOf2SortedArray.findMedianSortedArrays(input1, input2) shouldBe 2.5
  }

  it should "return 2 as result of given Array(1,3), Array(2)" in {
    val input1 = Array(1,3)
    val input2 = Array(2)

    mOf2SortedArray.findMedianSortedArrays(input1, input2) shouldBe 2
  }

  it should "return 2.5 as result of given Array(), Array(2,3)" in {
    val input1 = Array.empty[Int]
    val input2 = Array(2,3)

    mOf2SortedArray.findMedianSortedArrays(input1, input2) shouldBe 2.5
  }
}
