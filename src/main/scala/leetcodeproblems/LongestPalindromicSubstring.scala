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
  if (s == null || s.length == 0) return ""
  
  var start = 0
  var end = 0

  def expandAroundCenter(s: String, left: Int, right: Int): (Int, Int) = {
    var L = left
    var R = right
    while (L >= 0 && R < s.length && s(L) == s(R)) {
      L -= 1
      R += 1
    }
    (L + 1, R - 1)
  }

  for (i <- 0 until s.length) {
    val (left1, right1) = expandAroundCenter(s, i, i)   // Odd length palindrome
    val (left2, right2) = expandAroundCenter(s, i, i + 1) // Even length palindrome

    if (right1 - left1 > end - start) {
      start = left1
      end = right1
    }
    if (right2 - left2 > end - start) {
      start = left2
      end = right2
    }
  }

  s.substring(start, end + 1)
}

}
