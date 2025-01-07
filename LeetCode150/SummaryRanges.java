package LeetCode150;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void findRange(int[] nums){
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];

            while (i+1 < nums.length && nums[i+1] - nums[i] == 1) {
                i++;
            }
            if (start != nums[i]) {
                ans.add(start + "->" + nums[i]);
            }else{
                ans.add(String.valueOf(start));
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        findRange(new int[]{0,1,2,4,5,7});
    }
}
