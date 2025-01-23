package Striver.RecursionAndBackTracking;

public class Permutations {
    
    public static void findAllPermu(int idx,int[] nums){
        if (idx == nums.length) {
            for(int i : nums){
                System.out.print(i);
            }
            System.out.println();
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap(idx, i, nums);
            findAllPermu(idx+1, nums);
            swap(idx, i, nums);
        }
    }

    public static void swap(int i, int j, int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        findAllPermu(0, new int[]{1,2,3});
    }
}
