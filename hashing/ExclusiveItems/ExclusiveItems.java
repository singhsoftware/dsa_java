package hashing.ExclusiveItems;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class ExclusiveItems {
    public static List<Integer> exclusiveItems(List<Integer> a,
            List<Integer> b) {
        // hash set list a
        HashSet<Integer> setA = new HashSet<>(a);
        // hash set lisb b
        HashSet<Integer> setB = new HashSet<>(b);
        // array of results
        List<Integer> results = new ArrayList<Integer>();

        for (int ele : a) {
            if (!setB.contains(ele)) {
                results.add(ele);
            }
        }


        for (int ele : b) {
            if (!setA.contains(ele)) {
                results.add(ele);
            }
        }

        return results;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(4, 2, 1, 6);
        List<Integer> b = List.of(3, 6, 9, 2, 10);
        List<Integer> result = exclusiveItems(a, b);
        System.out.println(result);
    }
}
