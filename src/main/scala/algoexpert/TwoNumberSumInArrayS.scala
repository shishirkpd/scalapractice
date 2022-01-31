package algoexpert

import scala.util.control.Breaks.break

class TwoNumberSumInArrayS {

  def sumOfTwoNumberEqualTarget(array: Array[Int], targetNumber: Int): Array[Int] = {
    var i = 0
    var result: Array[Int] = Array.empty
    while(i < array.length) {
      val restNum = targetNumber - array(i)
      if(array.toList.drop(i+1).exists(_ == restNum)) {
        result = Array(array(i), restNum)
      }
      i += 1
    }
    result
  }
}
