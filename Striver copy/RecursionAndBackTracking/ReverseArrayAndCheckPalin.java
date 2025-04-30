package Striver.RecursionAndBackTracking;

import java.util.Arrays;

public class ReverseArrayAndCheckPalin {
    
    public static int[] reverse(int i,int n, int[] nums){
        if ( i >= n/2) {
            return null;
        }
        int temp = nums[i];
        nums[i] = nums[n-i-1];
        nums[n-i-1] = temp;
        reverse(i+1, n, nums);
        return nums;
    }

    public static Boolean isPalindrom(int i, String s){

        if (i >= s.length()/2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length()-i-1)) {
            return false;
        }
        return isPalindrom(i+1, s);
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        reverse(0, num.length, num);
        System.out.println(Arrays.toString(num));
        System.out.println(isPalindrom(0, "naman"));
    }
}
