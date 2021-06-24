package leetcodeproblems

import java.time.Instant

class LongestPalindromicSubstring {

  /** *
   *
   * Given a string s, return the longest palindromic substring in s.
   * Example 1:
   * Input: s = "babad"
   * Output: "bab"
   * Note: "aba" is also a valid answer.
   * Example 2:
   * Input: s = "cbbd"
   * Output: "bb"
   * Example 3:
   * Input: s = "a"
   * Output: "a"
   * Example 4:
   * Input: s = "ac"
   * Output: "a"
   * Constraints:
   * 1 <= s.length <= 1000
   * s consist of only digits and English letters (lower-case and/or upper-case),
   */

  def longestPalindrome(s: String): String = {
    val st: Long = System.currentTimeMillis()
    var res = List.empty[String]
    for (i <- 1 to s.length) yield {
      val a: List[String] = s.split("").sliding(i).map(_.mkString).toList.collect {
        case x: String if x.reverse.mkString == x.mkString => x.mkString
      }
      res = a ++ res
    }
    println("total time", (System.currentTimeMillis() - st))
    res.head
  }
}
