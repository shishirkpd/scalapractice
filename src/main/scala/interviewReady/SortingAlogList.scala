import scala.util.Random

object SortingAlgoList {

    extension [A](list: List[A]) {
        def insertionSort(comp: (A, A) => Int): List[A] =  {
            def insert(elem: A, rest: List[A]): List[A] = {
                if(rest.isEmpty) List(elem)
                else if(comp(elem, rest.head) < 0) elem :: rest
                else rest.head :: insert(elem, rest.tail)
            }

            if(list.isEmpty || list.tail.isEmpty) list
            else insert(list.head, list.tail.insertionSort(comp))


        }

        def mergeSort(comp: (A, A) => Int): List[A] = {
            def merge(hl: List[A], hr: List[A]): List[A] = {
                if(hl.isEmpty) hr
                else if(hr.isEmpty) hl
                else if(comp(hl.head, hr.head) < 0) hl.head :: merge(hl.tail, hr)
                else hr.head :: merge(hl, hr.tail)
            }

            if(list.isEmpty || list.tail.isEmpty) list
            else {
                val (hr, hl) = list.splitAt(list.length / 2)
                val hls = hr.mergeSort(comp)
                val hrs = hl.mergeSort(comp)

                merge(hls, hrs)
            }
        }


        def quickSort(comp: (A, A) => Int): List[A] = {
            
            if(list.isEmpty || list.tail.isEmpty) list
            
            else {
                val pivot = list.head
                val (smaller, bigger) = list.tail.partition(x => comp(x, pivot) < 0)
                smaller.quickSort(comp) ++ (pivot :: bigger.quickSort(comp))
            } 
        }

    }

    def main(args: Array[String]): Unit = {
        //val unsortedList: List[Int] = List(5, 2, 8, 6, 1, 4, 3)
        val unsortedList: List[Int] = (1 to 100).map(_ => Random.nextInt(100)).take(10).toList

        val naturalComprator: (Int, Int) => Int = Ordering[Int].compare

        val insertionSorting = unsortedList.insertionSort(naturalComprator)
        val mergeSorting = unsortedList.mergeSort(naturalComprator)
        val quickSorting = unsortedList.quickSort(naturalComprator)

        println("insert sort" + insertionSorting)  
        println("merge  sort" + mergeSorting)
        println("quick  sort" + quickSorting)
    
    }
}

