package leetcodeproblems
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class PlusOneSpec extends AnyFlatSpec {
   val plusOne = new PlusOne

  it should "return Array[3,0] of int with plus one for Array[2,9]" in {
    val intArray = Array(2,9)

    val res = plusOne.plusOne(intArray)

    res shouldBe Array(3,0)
  }

  it should "return Array[1] of int with plus one for Array[0]" in {
    val intArray = Array(0)

    val res = plusOne.plusOne(intArray)

    res shouldBe Array(1)
  }

  it should "return Array[1,0] of int with plus one for Array[9]" in {
    val intArray = Array(9)

    val res = plusOne.plusOne(intArray)

    res shouldBe Array(1,0)
  }

  it should "return Array[1,0,0] of int with plus one for Array[9,9]" in {
    val intArray = Array(9,9)

    val res = plusOne.plusOne(intArray)

    res shouldBe Array(1,0,0)
  }

  it should "return Array[1,3,4] of int with plus one for Array[1,3,3]" in {
    val intArray = Array(1,3,3)

    val res = plusOne.plusOne(intArray)

    res shouldBe Array(1,3,4)
  }

}
