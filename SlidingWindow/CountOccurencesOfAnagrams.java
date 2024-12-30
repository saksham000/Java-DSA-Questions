package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CountOccurencesOfAnagrams {

    public static void findAnagram(String s, String pat) {
        int k = pat.length();
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < pat.length(); i++) {
            char c = pat.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int count = map.size();
        int i = 0, j = 0;

        while (j < s.length()) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    count--;
                }
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (count == 0) {
                    ans.add(i);
                }
                char ch = s.charAt(i);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                    if (map.get(ch) == 1) {
                        count++;
                    }
                }
                i++;
                j++;
            }
        }
        for (int li : ans) {
            System.out.println(li);
        }
    }

    // HashSet Approch

    public static void secondApp(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0, i = 0, j = 0;

        while (j < s.length()) {
            char c = s.charAt(j);
            if (!set.contains(c)) {
                // Add the character to the set and expand the window
                set.add(c);
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                // Remove characters from the set starting from i
                set.remove(s.charAt(i));
                i++;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        findAnagram("cbaebabacd", "abc");
    }
}
