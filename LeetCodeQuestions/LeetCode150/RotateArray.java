package LeetCodeQuestions.LeetCode150;

import java.util.Scanner;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int[] arr2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr2[i] = nums[i];
        }
        int defk = k;
        k += 1;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[k++];
            if (k == nums.length) {
                break;
            }
        }

        System.out.println("value of k is " + k);

        for (int j = defk; j < nums.length; j++) {
            nums[j] = arr2[j - defk];
        }

        for (int i : nums) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int nums[] = { -1,-100,3,99 };
        System.out.println("Enter the value of K");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        System.out.println("Rotated Array is");
        rotate(nums, k);

    }
}