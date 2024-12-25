package LeetCode150;

public class ReverseWordsInString {

    public static void reverseString(String s) {
        s.trim();
        String[] strs = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            ans.append(strs[i] + " ");
        }
        s = ans.toString();
        System.out.println(s.trim());

    }

    public static void main(String[] args) {
        reverseString("hello world");
    }
}
