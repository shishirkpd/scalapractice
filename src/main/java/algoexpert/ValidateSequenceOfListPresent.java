package algoexpert;

import java.util.List;

public class ValidateSequenceOfListPresent {

    public boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.

        int i = 0;
        for (Integer num : array) {
            if (sequence.size() > i) {
                if (num == sequence.get(i))
                    i += 1;
            } else break;
        }
        return i == sequence.size();
    }
}
