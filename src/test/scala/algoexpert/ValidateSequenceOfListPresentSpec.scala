package algoexpert

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

import scala.collection.JavaConverters._

class ValidateSequenceOfListPresentSpec extends AnyFlatSpec {

  val validateSequenceOfListPresent = new ValidateSequenceOfListPresent()
  val validateSeq = new ValidateSequenceOfListPresentS

  it should "return true for the below inputs" in {
    val input: java.util.List[Integer] = List(5, 1, 22, 25, 6, -1, 8 , 10).map(_.asInstanceOf[Integer]).asJava
    val sequence: java.util.List[Integer] = List(1, 6, -1, 10).map(_.asInstanceOf[Integer]).asJava

    validateSequenceOfListPresent.isValidSubsequence(input, sequence) shouldBe true
    validateSeq.validateSeq(input, sequence) shouldBe true

  }

  it should "return false for the below inputs" in {
    val input: java.util.List[Integer] = List(5, 1, 22, 25, 6, -1, 8, 10).map(_.asInstanceOf[Integer]).asJava
    val sequence: java.util.List[Integer] = List(5, 1, 22, 22, 25, 6, -1, 8, 10).map(_.asInstanceOf[Integer]).asJava

    validateSequenceOfListPresent.isValidSubsequence(input, sequence) shouldBe false
    validateSeq.validateSeq(input, sequence) shouldBe false
  }

  it should "return false for the below inputs if not in sequence" in {
    val input: java.util.List[Integer] = List(5, 1, 22, 25, 6, -1, 8, 10).map(_.asInstanceOf[Integer]).asJava
    val sequence: java.util.List[Integer] = List(5, -1, 1, 8, 10).map(_.asInstanceOf[Integer]).asJava

    validateSequenceOfListPresent.isValidSubsequence(input, sequence) shouldBe false
    validateSeq.validateSeq(input, sequence) shouldBe false
  }

  it should "return false for the below inputs array is less than sequence" in {
    val input: java.util.List[Integer] = List(5, -1, 22).map(_.asInstanceOf[Integer]).asJava
    val sequence: java.util.List[Integer] = List(5, -1, 1, 8, 10).map(_.asInstanceOf[Integer]).asJava

    validateSequenceOfListPresent.isValidSubsequence(input, sequence) shouldBe false
    validateSeq.validateSeq(input, sequence) shouldBe false
  }
}
