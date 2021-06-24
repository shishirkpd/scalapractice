package leetcodeproblems

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class LongestPalindromicSubstringSpec extends AnyFlatSpec {

  val longestPalindromicSubstring = new LongestPalindromicSubstring

  it should "return bab for the given input babad" in {
    val input = "babad"
    longestPalindromicSubstring.longestPalindrome(input) shouldBe "bab"
  }

  it should "return bb for the given input cbbd" in {
    val input = "cbbd"
    longestPalindromicSubstring.longestPalindrome(input) shouldBe "bb"
  }

  it should "return a for the given input a" in {
    val input = "a"
    longestPalindromicSubstring.longestPalindrome(input) shouldBe "a"
  }

  it should "return a for the given input ac" in {
    val input = "ac"
    longestPalindromicSubstring.longestPalindrome(input) shouldBe "a"
  }

  it should "return a for the given input a to z" in {
    val input = "abcdefghijklmnopqrstuvwxyz"
    longestPalindromicSubstring.longestPalindrome(input) shouldBe "a"
  }

  it should "return xrcrx for the given long input" in {
    val input = "cyyoacmjwjubfkzrrbvquqkwhsxvmytmjvbborrtoiyotobzjmohpadfrvmxuagbdczsjuekjrmcwyaovpiogspbslcppxojgbfxhtsxmecgqjfuvahzpgprscjwwutwoiksegfreortttdotgxbfkisyakejihfjnrdngkwjxeituomuhmeiesctywhryqtjimwjadhhymydlsmcpycfdzrjhstxddvoqprrjufvihjcsoseltpyuaywgiocfodtylluuikkqkbrdxgjhrqiselmwnpdzdmpsvbfimnoulayqgdiavdgeiilayrafxlgxxtoqskmtixhbyjikfmsmxwribfzeffccczwdwukubopsoxliagenzwkbiveiajfirzvngverrbcwqmryvckvhpiioccmaqoxgmbwenyeyhzhliusupmrgmrcvwmdnniipvztmtklihobbekkgeopgwipihadswbqhzyxqsdgekazdtnamwzbitwfwezhhqznipalmomanbyezapgpxtjhudlcsfqondoiojkqadacnhcgwkhaxmttfebqelkjfigglxjfqegxpcawhpihrxydprdgavxjygfhgpcylpvsfcizkfbqzdnmxdgsjcekvrhesykldgptbeasktkasyuevtxrcrxmiylrlclocldmiwhuizhuaiophykxskufgjbmcmzpogpmyerzovzhqusxzrjcwgsdpcienkizutedcwrmowwolekockvyukyvmeidhjvbkoortjbemevrsquwnjoaikhbkycvvcscyamffbjyvkqkyeavtlkxyrrnsmqohyyqxzgtjdavgwpsgpjhqzttukynonbnnkuqfxgaatpilrrxhcqhfyyextrvqzktcrtrsbimuokxqtsbfkrgoiznhiysfhzspkpvrhtewthpbafmzgchqpgfsuiddjkhnwchpleibavgmuivfiorpteflholmnxdwewj"
    longestPalindromicSubstring.longestPalindrome(input) shouldBe "xrcrx"
  }
}
