package leetcodeproblems

import scala.annotation.tailrec
import scala.util.control.TailCalls.TailRec

class AddTwoNumbersOfLinkedList {

  /**
    * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list
    * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    * Example 1:
    * Input: l1 = [2,4,3], l2 = [5,6,4]
    * Output: [7,0,8]
    * Explanation: 342 + 465 = 807.
    * Example 2:
    * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    * Output: [8,9,9,9,0,0,0,1]
    */


  /*def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    var carry: Int = 0
    var dummyHead: ListNode = new ListNode(0)
    var curr = dummyHead
    var p = l1
    var q = l2
    while (p != null || q != null) {
      val (x, y) = (p, q) match {
        case (null, null) => {
          p = null
          q = null
          (0, 0)
        }
        case (null, y) => {
          p = null
          q = y.next
          (0, y.value)
        }
        case (x, null) => {
          p = x.next
          q = null
          (x.value, 0)
        }
        case (x, y) => {
          p = x.next
          q = y.next
          (x.value, y.value)
        }
      }
      val sum = x + y + carry
      carry = sum / 10
      curr.next = new ListNode(sum % 10)
      curr = curr.next
    }
    if (carry > 0) curr.next = new ListNode(carry)
    dummyHead.next
  }*/

  def addTwoNumbersRec(l1: ListNode, l2: ListNode): ListNode = {

    def _addNumR(l1: ListNode, l2: ListNode,carry: Int): ListNode = {
      (l1,l2) match {
        case (x, y) if x == null && y == null => {
          if(carry > 0) new ListNode(carry) else null
        }
        case (a,b) => {
          val x = if(a != null)  a.value else 0
          val y = if(b != null)  b.value else 0
          val sum = (x + y + carry)
          val newCarry  = (sum) / 10
          val nexta = if(a != null)  a.next else a
          val nextb = if(b != null)  b.next else b

          new ListNode(sum % 10, _addNumR(nexta, nextb, newCarry))
        }
      }

    }

    _addNumR(l1, l2, 0)
  }
}


class ListNode(_value: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var value: Int = _value
}