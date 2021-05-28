package leetcodeproblems

class MaxConsecutiveOnes {

  /***
    * Given a binary array, find the maximum number of consecutive 1s in this array.
    * Example 1:
    * Input: [1,1,0,1,1,1]
    * Output: 3
    * Explanation: The first two digits or the last three digits are consecutive 1s.
    * The maximum number of consecutive 1s is 3.
    * Note:
    * The input array will only contain 0 and 1.
    * The length of input array is a positive integer and will not exceed 10,000
    */

  def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
    val aList = nums.toList
    var max = 0
    val res = aList.fold(0)((a,b) => b match {
      case x if x == 0 && a > max => {
        max = a
        0
      }
      case y if y == 0 => 0

      case _ => a + b
    })

    if (res > max) res else max
  }


  // efficient solution
  def findMaxConsecutiveOnes_1(nums: Array[Int]): Int = {
    nums.foldLeft(0,0) { case(acc,i) =>
      val s = if (i==0) 0 else acc._1 + i
      (s, if(s > acc._2) s else acc._2)
    }._2
  }
}
