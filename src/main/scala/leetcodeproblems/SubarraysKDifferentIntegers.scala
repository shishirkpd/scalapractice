package leetcodeproblems

import scala.annotation.tailrec

class SubarraysKDifferentIntegers {

  /***
    * Given an array nums of positive integers, call a (contiguous, not necessarily distinct) subarray of nums good if the number of different integers in that subarray is exactly k.
    * (For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.)
    * Return the number of good subarrays of nums.
    * Example 1:
    * Input: nums = [1,2,1,2,3], k = 2
    * Output: 7
    * Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2].
    * Example 2:
    * Input: nums = [1,2,1,3,4], k = 3
    * Output: 3
    * Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].
    * Note:
    * 1 <= nums.length <= 20000
    * 1 <= nums[i] <= nums.length
    * 1 <= k <= nums.length
    */

  def subarraysWithKDistinct(nums: Array[Int], k: Int): Int = {
    var res = List(List.empty[Any])
    for (i <- k to nums.length) yield {
      val a: List[List[Int]] = nums.sliding(i).toList.collect {
        case x: Array[Int] if x.toList.toSet.size == k => {
          x.toList
        }
      }
      res = a :: res
    }
    res.flatten.size
  }

  def newSub(nums: Array[Int], k: Int): Int = {
    @tailrec
    def subArray(a: Array[Int], s: Int, e: Int, k: Int,  res: List[Any]): List[Any] = {
     (s,e) match {
       case (_,e) if e == a.length => res
       case (s,e) if s > e => subArray(a, 0, e + 1, k, res)
        case (s,e) => {
          var array = List.empty[Int]
          for (i <- s to e ) yield {
            array = array :+ a(i)
          }
          val ar: List[Any] = if(array.toSet.size == k) array :: res else res
          subArray(a, s + 1, e,k, ar)
        }
      }
    }
    subArray(nums, 0, 0, k, Nil).map(x => x.asInstanceOf[List[Int]]).size

  }
}

