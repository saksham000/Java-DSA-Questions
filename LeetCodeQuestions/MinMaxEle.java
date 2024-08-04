package LeetCodeQuestions;

public class MinMaxEle {

    public static void findMiniAndMax(int arr[]) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < arr[i + 1]) {
                min = arr[i];

            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 10, 7, 5, 4, 1, 8, 6 };
        findMiniAndMax(arr);
    }
}
