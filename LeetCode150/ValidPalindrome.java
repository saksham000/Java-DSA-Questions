package LeetCode150;

public class ValidPalindrome {

    public static void isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("false");
                return;
            }
            left++;
            right--;
        }

        System.out.println("true");
    }

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }
}
