package SlidingWindow;

import java.util.HashMap;

public class PickToys {

    public static void findSubString(String s) {
        int i = 0, j = 0, max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        while (j < s.length()) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

            if (map.size() < 2) {
                j++;
            } else if (map.size() == 2) {
                max = Math.max(max, j - i + 1);
                j++;
            } else if (map.size() > 2) {
                while (map.size() > 2) {
                    char ch = s.charAt(i);
                    map.put(ch, map.get(ch) -1);
                    if (map.get(ch) == 0) {
                        map.remove(ch);
                    }
                    i++;
                }
                j++;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        findSubString("abaccab");
    }
}
