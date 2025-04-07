package Striver.RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.List;

public class SortAnArrayMergeSort {

    static void merge(int[] arr, int low, int mid, int heigh) {
        int left = low;
        int right = mid + 1;
        List<Integer> list = new ArrayList<>();
        
        while (left <= mid && right <= heigh) {
            if (arr[left] <= arr[right]) {

                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }
        while (right <= heigh) {
            list.add(arr[right]);
            right++;
        }
        for (int i = low; i <= heigh; i++) {
            arr[i] = list.get(i - low);
        }
    }

    public static void mergerSort(int[] arr, int low, int heigh) {
        if (low >= heigh) {
            return;
        }
        int mid = (low + heigh) / 2;

        mergerSort(arr, low, mid);
        mergerSort(arr, mid + 1, heigh);
        merge(arr, low, mid, heigh);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1, 5 };
        mergerSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i);
        }
    }
}
