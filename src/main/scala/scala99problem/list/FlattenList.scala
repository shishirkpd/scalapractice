package scala99problem.list

class FlattenList {
  def flatten(listOfList: List[Any]): List[Any] = {

    def flatten_(list: List[Any], acc: List[Any]): List[Any] = list match {
      case Nil => acc
      case (x:List[Any]) :: Nil   =>  flatten_(x, acc)
      case (x:List[Any]) :: tail  => flatten_(tail, acc ::: x)
      case x :: tail              => flatten_(tail, acc ::: List(x))
    }

    flatten_(listOfList, Nil)
  }
}
