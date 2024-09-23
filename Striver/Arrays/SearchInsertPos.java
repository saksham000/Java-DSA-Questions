package Striver.Arrays;
//https://leetcode.com/problems/search-insert-position

public class SearchInsertPos {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = (nums.length-1)/2;



        return mid;
    }


    public static void main(String[] args) {

        int arr[] = {1,3,4,5,6};
        int target = 2;

        System.out.println(searchInsert(arr,target));
        
    }
    
}
