package RandomQuestions.ZopSmart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneDigitComb {

    public static void findComb(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            System.out.println(result);
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        StringBuilder comb = new StringBuilder();
        backtrack(digits, 0, comb, result, map);
        System.out.println(result);
    }

    public static void backtrack(String digits, int index, StringBuilder comb, List<String> result,
            HashMap<Character, String> map) {
        if (index == digits.length()) {
            result.add(comb.toString());
            return;
        }

        String letters = map.get(digits.charAt(index));
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            comb.append(letter);
            //com = a
            backtrack(digits, index + 1, comb, result, map);
            comb.deleteCharAt(comb.length() - 1); // ""
        }
    }

    public static void main(String[] args) {
        findComb("23");
    }
}
