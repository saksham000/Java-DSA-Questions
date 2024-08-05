package LeetCodeQuestions.BasicArrays;

public class PeekElement {

    public static int peekElements(int[] arr) {
        int peek = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] <= arr[i] && arr[i + 1] <= arr[i]) {
                peek = arr[i];
            }
        }

        return peek;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 5, 6, 4 };

        System.out.println(peekElements(arr));
    }
}
