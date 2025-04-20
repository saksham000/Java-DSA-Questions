package SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void findSub(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = Integer.MIN_VALUE;
        while (j < s.length()) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            if (map.size() == j - i + 1) {
                max = Math.max(max, j - i + 1);

            } else if (j - i + 1 > map.size()) {

                while (j - i + 1 > map.size()) {
                    char ch = s.charAt(i);
                    map.put(ch, map.get(ch) - 1);
                    if (map.get(ch) == 0) {
                        map.remove(ch);
                    }
                    i++;
                }
            }
            j++;
        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        findSub("pwwkew");
    }
}
