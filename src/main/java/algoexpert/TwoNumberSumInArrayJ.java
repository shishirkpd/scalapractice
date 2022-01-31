package algoexpert;

import java.util.Arrays;

/***
 * Write a function that takes in a non-empty array of distinct integers and an integer representing a
 * target sum. If any two numbers in the input array sum up to the target sum, the function should
 * return them in an array, in any order. If no two numbers sum up to the target sum, the function
 * should return an empty array.
 * Note that the target sum has to be obtained by summing two different integers in the array; you
 * can't add a single integer to itself in order to obtain the target sum.
 * You can assume that there will be at most one pair of numbers summing up to the target sum.
 * Sample Input
 * array = (3, 5,
 * -4, 8, 11, 1, -1, 6]
 * targetSum
 * 10
 * Sample Output
 * A
 * [-1, 11] // the numbers could be in reverse order
 */

public class TwoNumberSumInArrayJ {

    public int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int[] myIntArray = new int[0];
        for(int i = 0; i < array.length; i++) {
            int targetInt = targetSum - array[i];
            int finalI = i;
            if(Arrays.stream(array).anyMatch((x) -> x == targetInt &&
                    !(x == array[finalI] && Arrays.stream(array).filter((y) -> y == x).count() == 1))) {
                myIntArray = new int[]{array[i], targetInt};
                return myIntArray;
            }
        }
        return myIntArray;
    }

    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        return Arrays.stream(array).map(x -> x * x).sorted().toArray();
    }
}
