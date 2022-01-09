package interviewReady

class SumOfConsecutiveNumberEqualGivenNumber {


  /***
    *
    * @param N
    * @return
    *
    * Input: N = 15
      Output: 3
      Explanation:
      15 can be represented as:

      1 + 2 + 3 + 4 + 5
      4 + 5 + 6
      7 + 8
      Input: N = 10
      Output: 1
    */

  def findWaysToSumNumber(N: Int): Int = {
    var count = 0
    var L = 1
    while ( L * (L + 1) < 2 * N) {
      val a = ((1.0 * N - (L * (L + 1)) / 2) / (L + 1))
      if (a - a.toInt == 0.0) {
        // println((res.toInt to (res.toInt+start)).toList) if you want to know the which all numbers
        count += 1
      }

      L += 1
    }
    count
  }



  def recFindWaysToSumNumber(givenNumber: Int): Int = {

    def _recFindWaysToSumNumber(givenNumber: Int,  start: Int, count: Int): Int = start match {
      case s if  s * (s + 1) >= 2 * givenNumber => count
      case s if  s * (s + 1) < 2 * givenNumber => {
        val res = (1.0 * givenNumber - (start * (start + 1)) / 2) / (start + 1)
        var cou = count
        if(res - res.toInt == 0.0) {
         // println((res.toInt to (res.toInt+start)).toList) if you want to know the which all numbers
          cou += 1
        }
        _recFindWaysToSumNumber(givenNumber, start+ 1, cou)
      }
    }
    _recFindWaysToSumNumber(givenNumber, 1, 0)
  }
}
