package BasicArrays;

public class SortOn0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1,0,1,2};

        arr = SortArray.sort(arr);

        for(int i : arr){
            System.out.println(i);
        }



    }
}
