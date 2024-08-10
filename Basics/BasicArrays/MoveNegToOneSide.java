package BasicArrays;

public class MoveNegToOneSide {
    public static void main(String[] args) {
        int[] arr = { -1, -1, 0, 1, 1, 2, -2, -8, 9, -7 };
        arr = SortArray.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
