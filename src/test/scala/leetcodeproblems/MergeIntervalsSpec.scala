package leetcodeproblems

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class MergeIntervalsSpec extends AnyFlatSpec {

  val mergeIntervals = new MergeIntervals()


  it should "return the [[1,6],[8,10],[15,18]] for [[1,3],[2,6],[8,10],[15,18]]" in {
    val input = Array(Array(1,3), Array(2,6), Array(8,10), Array(15,18))
    val result = Array(Array(1,6), Array(8,10), Array(15,18))
    mergeIntervals.merge(input) shouldBe result
  }

  it should "return the [[1,5]] for [[1,4],[4,5]]" in {
    val input = Array(Array(1,4), Array(4,5))
    val result = Array(Array(1,5))
    mergeIntervals.merge(input) shouldBe result
  }

  it should "return the [[0,4]] for [[1,4], [0,4]]" in {
    val input = Array(Array(1,4), Array(0, 4))
    val result = Array(Array(0,4))
    mergeIntervals.merge(input) shouldBe result
  }

  it should "return the [[1,4]] for [[1,4], [1,4]]" in {
    val input = Array(Array(1,4), Array(1, 4))
    val result = Array(Array(1,4))
    mergeIntervals.merge(input) shouldBe result
  }

  it should "return the [[1,5]] for [[1,4],[1,5]]" in {
    val input = Array(Array(1,4), Array(1, 5))
    val result = Array(Array(1,5))
    mergeIntervals.merge(input) shouldBe result
  }

  it should "return the [[0,4]] for [[1,4],[0,1]]" in {
    val input = Array(Array(1,4), Array(0, 1))
    val result = Array(Array(0,4))
    mergeIntervals.merge(input) shouldBe result
  }

  it should "return the [[1,4]] for [[1,4],[2,3]]" in {
    val input = Array(Array(1,4), Array(2, 3))
    val result = Array(Array(1,4))
    mergeIntervals.merge(input) shouldBe result
  }

  it should "return the [[0,5]] for [[1,4],[0,5]]" in {
    val input = Array(Array(1,4), Array(0, 5))
    val result = Array(Array(0,5))
    mergeIntervals.merge(input) shouldBe result
  }

}
