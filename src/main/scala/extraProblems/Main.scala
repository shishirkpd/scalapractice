package extraProblems

import scala.io.StdIn.readLine

/*
object Main {
  def main(args: Array[String]) {
      var input = readLine
      val inputArray: Array[String] = input.split(",")
      val res = Integer.parseInt(inputArray(0), 2) + Integer.parseInt(inputArray(1), 2)
      println(Integer.toBinaryString(res))
  }
}*/


object Main {
  def main(args: Array[String]) {
    val input = readLine
    val inputArray = input.split(";")
    val pp = inputArray(0)
    val ch = inputArray(1)

    if(ch.toDouble > pp.toDouble) {
      val amountToReturn : Double = BigDecimal(ch.toDouble - pp.toDouble).setScale(3, BigDecimal.RoundingMode.HALF_DOWN).toDouble

      val numberOn100s: Int = (amountToReturn / 100).toInt
      val numberOn50s: Int = ((amountToReturn - 100 * numberOn100s) / 50).toInt
      val numberOn20s: Int = ((amountToReturn - (100 * numberOn100s + 50 * numberOn50s)) / 20).toInt
      val numberOn10s: Int = ((amountToReturn - (100 * numberOn100s + 50 * numberOn50s + 20 * numberOn20s)) / 10).toInt
      val numberOn5s: Int = ((amountToReturn - (100 * numberOn100s + 50 * numberOn50s + 20 * numberOn20s
        + 10 * numberOn10s)) / 5).toInt
      val numberOn2s: Int = ((amountToReturn - (100 * numberOn100s + 50 * numberOn50s + 20 * numberOn20s
        + 10 * numberOn10s+ 5 * numberOn5s)) / 2).toInt
      val numberOn1s: Int = ((amountToReturn - (100 * numberOn100s + 50 * numberOn50s + 20 * numberOn20s
        + 10 * numberOn10s+ 5 * numberOn5s + 2 * numberOn2s)) / 1).toInt
      val numberOn_50: Int = ((amountToReturn - (100 * numberOn100s + 50 * numberOn50s + 20 * numberOn20s
        + 10 * numberOn10s+ 5 * numberOn5s + 2 * numberOn2s
        + 1 * numberOn1s)) / .5).toInt
      val numberOn_25: Int = ((amountToReturn - (100 * numberOn100s + 50 * numberOn50s + 20 * numberOn20s
        + 10 * numberOn10s+ 5 * numberOn5s + 2 * numberOn2s
        + 1 * numberOn1s + .5 * numberOn_50)) / .25).toInt
      val numberOn_10: Int = ((amountToReturn - (100 * numberOn100s + 50 * numberOn50s + 20 * numberOn20s
        + 10 * numberOn10s+ 5 * numberOn5s + 2 * numberOn2s
        + 1 * numberOn1s + .5 * numberOn_50 + .25 * numberOn_25)) / .05).toInt
      val numberOn_05: Int = ((amountToReturn - (100 * numberOn100s + 50 * numberOn50s + 20 * numberOn20s
        + 10 * numberOn10s+ 5 * numberOn5s + 2 * numberOn2s
        + 1 * numberOn1s + .5 * numberOn_50 + .25 * numberOn_25 + .10 * numberOn_10)) / .05).toInt
      val numberOn_01: Int = ((amountToReturn - (100 * numberOn100s + 50 * numberOn50s + 20 * numberOn20s
        + 10 * numberOn10s+ 5 * numberOn5s + 2 * numberOn2s
        + 1 * numberOn1s + .5 * numberOn_50 + .25 * numberOn_25
        + .10 * numberOn_10 + .05 * numberOn_05 )) / .01).toInt


     val zipOfNumberAndCount =  List((numberOn100s, 100), (numberOn50s, 50), (numberOn20s, 20),
        (numberOn10s, 10), (numberOn5s, 5), (numberOn2s, 2),
        (numberOn1s, 1), (numberOn_50, .5), (numberOn_25, .25), (numberOn_05, .05),
        (numberOn_01, .01))
       val res = zipOfNumberAndCount.map { countAndNumber => countAndNumber match {
        case (x, y) if y == 100 => for(a <- 1 to x) yield "ONE HUNDRED"
        case (x, y) if y == 50 => for(a <- 1 to x) yield "FIFTY"
        case (x, y) if y == 20 => for(a <- 1 to x) yield "TWENTY"
        case (x, y) if y == 10 => for(a <- 1 to x) yield "TEN"
        case (x, y) if y == 5 => for(a <- 1 to x) yield "FIVE"
        case (x, y) if y == 2 => for(a <- 1 to x) yield "TWO"
        case (x, y) if y == 1 => for(a <- 1 to x) yield "ONE"
        case (x, y) if y == .5 => for(a <- 1 to x) yield "HALF DOLLAR"
        case (x, y) if y == .25 => for(a <- 1 to x) yield "HALF DOLLAR"
        case (x, y) if y == .10 => for(a <- 1 to x) yield "DIME"
        case (x, y) if y == .05 => for(a <- 1 to x) yield "NICKEL"
        case (x, y) if y == .01 => for(a <- 1 to x) yield "PENNY"
       }
      }.flatten

      println(res.mkString(","))
    }
    else if(ch.toDouble == pp.toDouble) println("ZERO")
    else println("ERROR")

  }
}