package BasicArrays;

public class Occurence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 4, 2, 8, 8, 9, 2, 2 };
        int count = 1;
        int n = 2;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        System.out.println(n + " is Occured " + count + " Times");
    }
}
