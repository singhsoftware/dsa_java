// all unique
// Write a method, allUnique, that takes in an list. The method should return a boolean indicating
// whether or not the list contains unique items.

package hashing.AllUnique;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

class AllUnique {
    public static boolean allUnique(List<String> items) {
        Set<String> setOfItems = new HashSet<String>(items);
        return items.size() == setOfItems.size();
    }

    public static void main(String[] args) {
        List<String> a = List.of("aa", "ba", "za");
        boolean result = allUnique(a);
        System.out.println(result);
    }
}
