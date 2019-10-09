def reverse[A](list: List[A], acc: List[A]): List[A] = list match {
  case Nil => acc
  case head :: xs => reverse(xs, head +: acc)
}

reverse((1 to 5).toList, Nil)

val str = "this is the reverse"

def revStr(str: String): String = {
  def revStr_(str: String, acc: String): String = str match {
    case s if s.length > 0 => revStr_(s.dropRight(1), acc + s.takeRight(1))
    case _ => acc
  }
  revStr_(str, "")
}

revStr(str)

val conList = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

val res = conList.foldLeft(List(List.empty[Char])){
  (res, ele) => if(res.last.nonEmpty && res.last.last == ele) {
     res.init ::: List(res.last :+ ele)
  } else {
    res ::: List(List(ele))
  }
}.filter(_.nonEmpty)

println(res)

val res44 = conList.groupBy(x => x ).map(y => (y._1, y._2.size))

println(res44)