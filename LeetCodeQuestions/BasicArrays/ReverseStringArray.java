package LeetCodeQuestions.BasicArrays;

import java.util.Arrays;

public class ReverseStringArray {
    public static void main(String[] args) {
        char[] c = { 'h', 'e', 'l', 'l', 'o' };
        int left = 0;
        int right = c.length - 1;

        while (left < right) {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(c));
    }
}
