package LeetCodeQuestions.BasicArrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionInArray {
    public static void main(String[] args) {
        int[] arr = { 18, 22, 53, 24, 65 };
        int[] newArray = new int[arr.length + 1];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to insert");
        int num = sc.nextInt();
        System.out.println("Enter the postion");
        int pos = sc.nextInt();
        sc.close();

        for (int i = 0; i < pos - 1; i++) {
            newArray[i] = arr[i];
        }

        newArray[pos - 1] = num;

        for (int i = pos + 1; i <= arr.length; i++) {
            newArray[i] = arr[i - 1];
        }
        System.out.println("The Array After Insertipn is");
        System.out.println(Arrays.toString(newArray));
    }
}
