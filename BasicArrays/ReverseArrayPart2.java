package BasicArrays;

import java.util.Arrays;

public class ReverseArrayPart2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int temp = 0;
        int front = 0;
        int back = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            front = i;
            back = arr.length - 1 - i;
            temp = arr[front];
            arr[front] = arr[back];
            arr[back] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
