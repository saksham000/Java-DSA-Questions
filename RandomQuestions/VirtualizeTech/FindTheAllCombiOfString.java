package RandomQuestions.VirtualizeTech;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheAllCombiOfString {

    public static void findAllCombi(int idx, char[] s, Set<List<Character>> ans) {
        if (idx == s.length) {
            List<Character> ds = new ArrayList<>();

            for (int i = 0; i < s.length; i++) {
                ds.add(s[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = idx; i < s.length; i++) {
            swap(i, idx, s);
            findAllCombi(idx + 1, s, ans);
            swap(i, idx, s);
        }
    }

    static void swap(int i, int idx, char[] s) {
        char temp = s[i];
        s[i] = s[idx];
        s[idx] = temp;
    }

    public static void main(String[] args) {
        String s = "aba";
        Set<List<Character>> ans = new HashSet<>();
        findAllCombi(0, s.toCharArray(), ans);
        for (List<Character> c : ans) {
            System.out.println(c);
        }
    }
}
