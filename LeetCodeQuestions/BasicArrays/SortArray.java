package LeetCodeQuestions.BasicArrays;

import java.util.Arrays;

public class SortArray {
    public static int[] sort(int[] arr) {
        int temp = 0;
        int size = arr.length - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 9 };
        int reversedArray[] = sort(arr);
        System.out.println(Arrays.toString(reversedArray));

        // for(int i=0;i<reversedArray.length-1;i++){
        // System.out.println(reversedArray[i]);
        // }
    }

}
