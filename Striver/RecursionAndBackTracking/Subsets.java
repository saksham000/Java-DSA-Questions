package Striver.RecursionAndBackTracking;

import java.util.ArrayList;

public class Subsets {

    public static void findAllSubSets(int i, ArrayList<Integer> list, int[] nums, int n) {
        if (i == n) {
            for (int ele : list) {
                System.out.print(ele);
            }
            System.out.println();
            return;
        }
        // take or not take
        list.add(nums[i]);
        findAllSubSets(i + 1, list, nums, n);
        list.remove(list.size() - 1);

        // not take
        findAllSubSets(i + 1, list, nums, n);
        
    }
    public static void main(String[] args) {
        findAllSubSets(0, new ArrayList<>(), new int[] { 3, 1, 2 }, 3);
    }
}
