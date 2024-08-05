package LeetCodeQuestions.BasicArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeletionInArray {
    public static void main(String[] args) {
        int[] arr = { 51, 42, 73, 82, 35 };
        int[] newArray = new int[arr.length - 1];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to delete");
        int num = sc.nextInt();
        sc.close();
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                arr[i] = arr[i + 1];
                pos = i;
            }
        }
        for(int i=0;i<=pos;i++){
            newArray[i] = arr[i];
        }
        for(int i=pos;i<arr.length-1;i++){
            newArray[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(newArray));

    }
}
