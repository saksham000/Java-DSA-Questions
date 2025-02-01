package RandomQuestions.VirtualizeTech;

public class FindIndexofKeyValue {
    
    public static int findIndex(int[] nums, int key){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int key = 10;
        System.out.println(findIndex(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3}, key));
    }
}
