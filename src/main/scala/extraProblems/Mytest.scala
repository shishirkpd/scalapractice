package extraProblems

import scala.annotation.tailrec

object Mytest extends App {

    def myFun(numList: List[Double], num: Double): Unit =  {

     // numList.toSet.subsets.map(_.toList).toList.find(_.sum == num)

      def _recCheck(curList: List[Double], numList: List[Double],  num: Double, index: Int): List[Double] = (curList, num) match {
        case (cl, n) if cl.sum == n => cl
        case (cl, n) if cl.sum > n => _recCheck(cl.dropRight(1) :+ numList(index), numList, num, index + 1)
        case (cl, _) => _recCheck(cl :+ numList(index), numList, num, index + 1)
      }

      for(n <- 0 to numList.length) {
       println(_recCheck(List.empty, numList, num, n))
      }
    }

  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
    // Write your code here
    var aCount = 0
    var bCount = 0

    for (i <- 0 to a.length - 1) {
      (a(i), b(i)) match {
        case (a, b) if a > b => aCount += 1
        case (a, b) if a < b => bCount += 1
      }
    }
    Array(aCount, bCount)
  }


  def gradingStudents(grades: Array[Int]): Array[Int] = {
    // Write your code here
    grades.map(x => x match {
      case x if x % 5 >= 3 && x >= 38 => x + (5- x % 5)
      case x => x
    })
  }

    val nult =  List(74280.00,
    84594.00,
    71830.00,
    382443.10,
    58891.00,
    194320.00,
    93860.00,
    24510.00,
    104455.00,
    365176.50,
    68400.00,
    35300.00,
    28875.00,
    45785.00,
    123210.00,
    32675.00,
    37710.00,
    77957.50,
    119684.25,
    11600.00,
    182418.75,
    88455.00,
    14107.50,
    30390.00,
    2314642.50,
    18507.50,
    205436.00,
    27190.00,
    22395.00,
    32286.00,
    176463.00,
    424966.00,
    71760.00,
    13265.00,
    187960.00,
    95010.00,
    58375.00,
    325575.00,
    102930.00,
    11081.00,
    173098.00,
    76825.00,
    15403.00,
    144728.00,
    37714.50,
    45080.00,
    105766.50,
    88020.00,
    28150.00,
    58452.50,
    68640.00,
    38879.00,
    65565.00,
    19550.00,
    74285.00,
    27740.00,
    1400.00,
    32830.00)


 // myFun(nult, 282775.00	)

  def powerset[A](s: Set[A]) = s.foldLeft(Set(Set.empty[A])) { case (ss, el) => ss ++ ss.map(_ + el) }

  //val res = powerset(nult.toSet)

  //println(nult.sliding(3, 1).toList)

  def combinationUtil(arr: Array[Double],n: Int, r: Int, ind: Int,dataT: Array[Double], i: Int): Unit = {
    var data = dataT
    var index = ind
    var list: List[Double] = List.empty
    if (index == r) {
      var j = 0
      while ( {
        j < r
      }) {
        list = list :+ data(j)
        j += 1
      }
     // if(list.sum == 1321702)
        System.out.println(list)

      return
    }

    // When no more elements are there to put in data[]
    if (i >= n) return

    // current is included, put next at next
    // location
    data(index) = arr(i)
    combinationUtil(arr, n, r, index + 1, data, i + 1)

    // current is excluded, replace it with
    // next (Note that i+1 is passed, but
    // index is not changed)
    combinationUtil(arr, n, r, index, data, i + 1)
  }

 /* var a : List[Double] = null
  for(n <- 0 to nult.length) {
    for(j <- n+1 to nult.length) {
       println(nult.drop(j))
    }
  }*/


  def printCombination(arr: Array[Double], n: Int, r: Int): Unit = {
    val data = new Array[Double](r)

    // Print all combination using temporary
    // array 'data[]'
    combinationUtil(arr, n, r, 0, data, 0)
  }

  printCombination(nult.toArray, nult.length, 13)
}
