package LeetCode150;

import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAngram(String s, String t) {

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!sMap.containsKey(c) && !sMap.get(c).equals(tMap.get(c))) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAngram("anagram", "nagaram"));
    }
}
