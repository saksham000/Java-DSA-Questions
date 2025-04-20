package SlidingWindow;

import java.util.HashMap;

public class MinimumWindowSubstring {

    public static void findMinSub(String s, String t) {

        int i = 0, j = 0, min = Integer.MAX_VALUE;
        String ans = "";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int k = 0; k < t.length(); k++) {
            char c = t.charAt(k);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = map.size();

        while (j < s.length()) {
            char c = s.charAt(j);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    count--;
                }
            }

            while (count == 0) {
                if (min > j - i + 1) {
                    min = j - i + 1;
                    ans = s.substring(i, j + 1);
                }

                char ch = s.charAt(i);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                    if (map.get(ch) > 0) {
                        count++;
                    }
                }
                i++;
            }
            j++;
        }

        System.out.println(ans);

    }

    public static void main(String[] args) {
        findMinSub("ADOBECODEBANC", "ABC");
    }
}
