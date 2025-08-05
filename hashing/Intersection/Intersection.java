package hashing.Intersection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Intersection {
    public static List<Integer> intersection(List<Integer> listA,
            List<Integer> listB) {
        HashSet<Integer> set = new HashSet<>(listA);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < listB.size(); i++) {
            if (set.contains(listB.get(i))) {
                result.add(listB.get(i));
            }
        }
        return result;

    }

    public static void main(String[] args) {
        List<Integer> a = List.of(4, 2, 1, 6);
        List<Integer> b = List.of(3, 6, 9, 2, 10);
        List<Integer> result = intersection(a, b);
        System.out.println(result);
    }
}
