package leetcodeproblems

import scala.annotation.tailrec

class MaxOfConsecutiveNumbers {

  /**
    *  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    * You may assume that each input would have exactly one solution, and you may not use the same element twice.
    * You can return the answer in any order.
    * Example 1:
    * Input: nums = [2,7,11,15], target = 9
    * Output: [0,1]
    * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
    * Example 2:
    * Input: nums = [3,2,4], target = 6
    * Output: [1,2]
    * Example 3:
    * Input: nums = [3,3], target = 6
    * Output: [0,1]
    * Constraints:
    * 2 <= nums.length <= 103
    * -109 <= nums[i] <= 109
    * -109 <= target <= 109
    * Only one valid answer exists.
    *
    */


  def getIndexOfGreatestSum(input: Array[Int]):(Int, Int) = {
    var maxSum = 0
    var start = 0
    var end = 0

    @tailrec
    def rgetIndex(input: Array[Int], sIndex: Int, eIndex: Int, max: Int): (Int, Int) = {
      (sIndex, eIndex) match {
        case (s,e)  if s < input.length && e < input.length  && input(s) + input(e) > max => {
          maxSum = input(s) + input(e)
          start = s
          end = e
          rgetIndex(input, e, e + 1, maxSum)
        }
        case (s,e) if s <= input.length && e > input.length => (start, end)
        case _ =>  rgetIndex(input, eIndex, eIndex + 1, maxSum)
      }
    }

    rgetIndex(input, 0, 1, 0)
  }


}
