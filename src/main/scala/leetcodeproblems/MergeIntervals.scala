package leetcodeproblems

class MergeIntervals {
  //company -Apple
  /***
   * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
   * Example 1:
   * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
   * Output: [[1,6],[8,10],[15,18]]
   * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
   * Example 2:
   * Input: intervals = [[1,4],[4,5]]
   * Output: [[1,5]]
   * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
   * Constraints:
   * 1 <= intervals.length <= 104
   * intervals[i].length == 2
   * 0 <= starti <= endi <= 104
   */


  def merge(intervals: Array[Array[Int]]): Array[Array[Int]] = {

    def _merge(intervals: List[Array[Int]], res: List[Array[Int]]) : List[Array[Int]] = {
      intervals match {
        case x :: y :: tail => _merge(tail , mergeTwoArray(x, y, res))
        case x :: Nil => res :+ x
        case Nil => res
      }
    }

   _merge(intervals.toList, Nil).toArray
  }

  private def mergeTwoArray(x: Array[Int], y: Array[Int], res: List[Array[Int]]): List[Array[Int]] = {
    (x.toList, y.toList) match {
      case (a, Nil) => res :+ a.toArray
      case (a, b) if a == b =>  res :+ a.toArray
      case (a, b)  if a.last >= b.head && a.head <= b.head && a.last > b.last => res ++ List(Array(a.head, a.last))
      case (a, b)  if a.last >= b.head && a.head <= b.head => res ++ List(Array(a.head, b.last))
      case (a, b)  if a.last >= b.head && a.head > b.head && a.last > b.last => res ++ List(Array(b.head, a.last))
      case (a, b)  if a.last >= b.head && a.head > b.head && a.last < b.last => res ++ List(Array(b.head, b.last))
      case (a, b)  if a.last >= b.head && a.head > b.head => res ++ List(Array(b.head, a.last))
      case (a, b)  if a.last >= b.head && a.head < b.head => res ++ List(Array(b.head, b.last))
      case (a, b) => res ++ List(a.toArray, b.toArray)
    }
  }
}
