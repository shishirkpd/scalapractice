package extraProblems

import scala.annotation.tailrec


object NWaysToClimbStair extends App {

  def NWaysTOClimbStair(n: Int) : Int= {
    @tailrec
    def climbStair(n: Int, acc: Int):Int  =  {
      if(n <= 0) acc
      else if( n == 1) acc + 1
      else if(n ==2)  acc + 2
      else climbStair(n-2 , acc)
    }

    climbStair(n, 0)
  }

  println(NWaysTOClimbStair(100))
}
