package hashing.PairSum;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = List.of(3, 2, 5, 4, 1);
        int target = 8;
        List<Integer> result = PairSum.pairSum(input, target);
        System.out.println(result); // Output: [0, 2]

    }
}
