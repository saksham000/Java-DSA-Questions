package LeetCodeQuestions.LeetCode150;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void rotate(int[] nums, int k) {

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = 0;
            int front = i;
            int back = nums.length - 1 - i;
            temp = nums[front];
            nums[front] = nums[back];
            nums[back] = temp;
        }

        for (int i = 0; i < k - 1; i++) {
            int temp = 0;
            int front = i;
            int back = k - 1 - i;
            temp = nums[front];
            nums[front] = nums[back];
            nums[back] = temp;
        }

        for (int i = k; i < (nums.length + k) / 2; i++) {
            int temp = 0;
            int front = i;
            int back = nums.length - 1 - (i - k);
            temp = nums[front];
            nums[front] = nums[back];
            nums[back] = temp;
        }

        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Enter the value of K");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        System.out.println("Rotated Array is");
        rotate(nums, k);

    }
}