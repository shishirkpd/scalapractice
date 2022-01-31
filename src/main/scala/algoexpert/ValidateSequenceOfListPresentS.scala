package algoexpert

class ValidateSequenceOfListPresentS {
    def validateSeq(input: java.util.List[Integer], seq: java.util.List[Integer]): Boolean = {
      input.toArray.foldLeft(0)((i,n) => {
        if(n == seq.get(i))
          i + 1
        else i
      }) == seq.size()
    }
}
