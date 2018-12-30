def reverse[A](list: List[A], acc: List[A]): List[A] = list match {
  case Nil => acc
  case head :: xs => reverse(xs, head +: acc)
}

reverse((1 to 5).toList.flatten, Nil)

val str = "this is the reverse"

def revStr(str: String): String = {
  def revStr_(str: String, acc: String): String = str match {
    case s if s.length > 0 => revStr_(s.dropRight(1), acc + s.takeRight(1))
    case _ => acc
  }
  revStr_(str, "")
}

revStr(str)