package SlidingWindow;

public class MaxSumSubArrayOfSizeK {

    public static void findMaxSubArray(int[] arr, int k) {

        int i = 0, j = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(sum, max);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        int num[] = { 100, 200, 300, 400 };
        findMaxSubArray(num, 2);
    }
}
