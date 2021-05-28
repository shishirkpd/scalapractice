package leetcodeproblems


import scala.util.control.Breaks.{break, breakable}

class TwoSum {
  /**
    * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
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
    */

  def findPositionForTarget(intArray: Array[Int], targetNumber: Int): Array[Int] = {

    /*def _findPosition(intArr: List[Int], tnum: Int): (Int, Int) = {
      intArr match {
        case x :: y :: tail if x + y == tnum => (intArray.indexOf(x), intArray.indexOf(x) + 1)
        case x :: y :: tail  => _findPosition(y :: tail, tnum)
      }
    }

    val res = _findPosition(intArray.toList, targetNumber)
    Array(res._1, res._2)*/
    var res: Array[Int] = Array.empty
    breakable {
      for ((a, i) <- intArray.zipWithIndex) {
        for ((b, j) <- intArray.drop(i+1).zipWithIndex) {
          if (a + b == targetNumber) {
            res = Array(i, i + j + 1)
            break
          }
        }
      }
    }

    res
  }

//efficient solution
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val hashMap = new scala.collection.mutable.HashMap[Int, Int]()
    for (i <- 0 until nums.length) {
      hashMap.get(target - nums(i)) match {
        case Some(v) => return Array(v, i)
        case None => hashMap.addOne(nums(i), i)
      }
    }
    return Array(0, 0)

  }

}
