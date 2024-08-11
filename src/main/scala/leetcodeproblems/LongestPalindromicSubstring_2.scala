package leetcodeproblems

import java.time.Instant

class LongestPalindromicSubstring_2 {

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

  object Solution {
    def longestPalindrome(s: String): String = {
        def getPalindrome(left: Int, right: Int): String = 
            if (left < 0 || right >= s.length || s(left) != s(right))
                s.substring(left + 1, right)
            else getPalindrome(left - 1, right + 1)

        (0 until s.length).foldLeft("") { case (res, i) => 
            val p1 = getPalindrome(i, i)
            val p2 = getPalindrome(i, i + 1)

            val p = if (p1.length > p2.length) p1 else p2
            if(res.length > p.length) res else p
        }
    }
}

}
