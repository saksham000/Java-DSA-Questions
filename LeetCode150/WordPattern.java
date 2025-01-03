package LeetCode150;

import java.util.HashMap;

public class WordPattern {

    public static boolean matchIt(String pat, String s) {

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();
        String[] strs = s.split(" ");
        for (int i = 0; i < pat.length(); i++) {

            char cp = pat.charAt(i);
            String st = strs[i];

            if (charToWord.containsKey(cp) && !charToWord.get(cp).equals(st)) {
                return false;
            } else {
                charToWord.put(cp, st);
            }
            if (wordToChar.containsKey(st) && !wordToChar.get(st).equals(cp)) {
                return false;
            } else {
                wordToChar.put(st, cp);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(matchIt("aaaa", "dog cat cat dog"));
    }
}
