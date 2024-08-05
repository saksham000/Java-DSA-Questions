package LeetCodeQuestions.BasicArrays;

import java.util.Scanner;

public class KthLargestAndSmallest {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int arr[] = SortArray.sort(nums);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of K Largest and Smallest");
        int k = sc.nextInt();
        int s = sc.nextInt();
        sc.close();
        int kLargets = arr[arr.length - k];
        int kSmallest = arr[s-1];

        System.out.println("K largets elemnt is " + kLargets);
        System.out.println("K smallest elemnt is " + kSmallest);

    }

}
