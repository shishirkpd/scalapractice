package leetcodeproblems

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class AddTwoNumbersOfLinkedListSpec extends AnyFlatSpec {

  val addTwoNumbers = new AddTwoNumbersOfLinkedList
  val l1 = new ListNode(3)
  val l2 = new ListNode(4, l1)
  val l3 = new ListNode(2, l2)
  val l4 = new ListNode(4)
  val l5 = new ListNode(6, l4)
  val l6 = new ListNode(5, l5)
  val l7 = new ListNode(4)
  val l8 = new ListNode(4)

  it should "add the given two linkedlist" in {
    val l1 = new ListNode(8)
    val l2 = new ListNode(0, l1)
    val res= new ListNode(7, l2)
    val res1 = addTwoNumbers.addTwoNumbersRec(l3, l6).next
   addTwoNumbers.addTwoNumbersRec(l3, l6).equals(res) shouldBe true
  }
}
