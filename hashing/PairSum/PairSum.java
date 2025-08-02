package hashing.PairSum;

import java.util.HashMap;
import java.util.List;

// pair sum
// Write a method, pairSum, that takes in a List and a target sum as arguments. The function should
// return a List containing a pair of indices whose elements sum to the given target. The indices
// returned must be unique.

// Be sure to return the indices, not the elements themselves.

// There is guaranteed to be one such pair that sums to the target.

public class PairSum {

    public static List<Integer> pairSum(List<Integer> numbers, int target) {

        // create a hashmap to hold read numbers and their index

        HashMap<Integer, Integer> alreadyKnownElements = new HashMap<>();

        // go through array of numbers, calculate complement, check if complement is in hashmap or not

        for (int i = 0; i < numbers.size(); i++) {

            int number = numbers.get(i);
            int complement = target - number;

            if (alreadyKnownElements.containsKey(complement)) {
                return List.of(alreadyKnownElements.get(complement), i);
            }

            alreadyKnownElements.put(number, i);

        }

        return null;

    }


}
