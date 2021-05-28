package leetcodeproblems

class LongestSubstringNoRepeatChar {

  def findSubString(s: String): String = {
    var longest = ""
    var temp = ""
    val res = s.foldLeft("")((a,b) => {
      if(a.contains(b)) {
        val res = a.drop(a.lastIndexOf(b) + 1) + b
        if (res.length >= longest.length)
          longest = res
        res
      }
      else {
        temp = a + b
        if(temp.length > longest.length )
          longest = temp
        a + b

      }
    })

    if(longest.length <= res.length) res else longest
  }
}
