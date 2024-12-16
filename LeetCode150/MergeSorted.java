package LeetCode150;

import java.util.Arrays;

import BasicArrays.SortArray;

public class MergeSorted {

    public static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int finalArray[] = new int[nums1.length];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = nums1[i];
            finalArray[m++] = nums2[i];
            if (m == finalArray.length) {
                break;
            }
        }
        finalArray = SortArray.sort(finalArray);
        System.out.println(Arrays.toString(finalArray));

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;

        mergeSortedArray(nums1, m, nums2, n);
    }

}
