public class MoveNon0 {
    public static void main(String[] args) {
        int arr[] = { 4,5,0,1,9,0,5,0 };
        int arr2[] = arr;
        int size = arr.length;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count += 1;
            }
        }
    }
}
