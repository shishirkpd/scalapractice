package leetcodeproblems

class LongestSubstringAtMost2DistinctChar {

  /***
    * Given a string, find the length of the longest substring T that contains at most 2 distinct characters.
    * Example
    * Example 1
    * Input: “eceba”
    * Output: 3
    * Explanation:
    * T is "ece" which its length is 3.
    * Example 2
    * Input: “aaa”
    * Output: 3
    */

  def lengthOfLongestSubstringTwoDistinct(s: String): Int = {

    var res = List(List.empty[Any])
    for (i <- 1 to s.length) yield {
      val a: List[List[String]] = s.split("").sliding(i).toList.collect {
        case x: Array[String] if x.distinct.size <= 2 => {
          x.toList
        }
      }
      res = a :: res
    }
    val a = res.flatten.map(_.asInstanceOf[List[String]]).sortBy(_.size).last
    //println(a.mkString)
    a.size
  }
}
