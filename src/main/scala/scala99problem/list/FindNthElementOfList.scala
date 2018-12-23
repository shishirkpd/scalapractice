package scala99problem.list

class FindNthElementOfList {

  /***
    *
    * @param list
    * @param lastNth
    * @tparam A
    * @return
    *
    * lastNthElement(List(1,2,3,4,5), 2)
    * first iteration
    * case 1: will not be invoked
    * case 2: will be invoked with => lastNthElement (List(2,3,4,5), 2)
    * second Iteration
    * case 2: will be invoked with => lastNthElement (List(3,4,5), 2)
    * third Iteration
    * case 2: will be invoked with => lastNthElement (List(4,5), 2)
    * fourth iteration
    * case 1: will be invoked => List(4,5).length == 2 it will return the head of the list which is 4
    * so the result will be 4
    */
  
  def lastNthElement[A](list: List[A], lastNth: Int): A = list match {
    case tail if tail.length == lastNth => tail.head
    case _ :: tail => lastNthElement(tail, lastNth)
    case _ => throw new NoSuchElementException
  }
}
