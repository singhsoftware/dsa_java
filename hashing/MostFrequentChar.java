package hashing;

import java.util.HashMap;

/*
 * most frequent char Write a function, mostFrequentChar, that takes in a string as an argument. The
 * function should return the most frequent character of the string. If there are ties, return the
 * character that appears earlier in the string.
 * 
 * You can assume that the input string is non-empty.
 */

public class MostFrequentChar {

  public static HashMap<Character, Integer> charCount(String s) {

    HashMap<Character, Integer> counter = new HashMap<>();
    for (char c : s.toCharArray()) {

      if (counter.get(c) == null) {
        counter.put(c, 0);
      }
      int current = counter.get(c);
      counter.put(c, current + 1);
    }

    return counter;

  }

  public static char mostFrequentChar(String s) {

    HashMap<Character, Integer> counter = charCount(s);
    char mostFrequent = '\0';

    for (char c : s.toCharArray()) {

      if (mostFrequent == '\0' || counter.get(c) > counter.get(mostFrequent)) {
        mostFrequent = c;
      }

    }
    return mostFrequent;

  }

}


