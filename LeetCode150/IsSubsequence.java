package LeetCode150;    

public class IsSubsequence {

    public static void isSubSeq(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == s.charAt(j))
                i++;
            j++;
        }
        System.out.println(s.length() == i);
    }

    public static void main(String[] args) {
        isSubSeq("abc", "ahbgdc");
    }
}
