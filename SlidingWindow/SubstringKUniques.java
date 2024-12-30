package SlidingWindow;

import java.util.HashMap;

public class SubstringKUniques {

    // gfg version
    public static void findLargestSubWithK(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = Integer.MIN_VALUE;

        while (j < s.length()) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

            if (map.size() < k) {
                j++;
            } else if (map.size() == k) {
                max = Math.max(max, j - i + 1);
                j++;
            } else if (map.size() > k) {

                while (map.size() > k) {
                    
                    char ch = s.charAt(i);
                    map.put(ch, map.get(ch) - 1);
                    if (map.get(ch) == 0) {
                        map.remove(ch);
                    }
                    i++;
                }
                j++;
            }
        }
        System.out.println(max);
    }

    //Leetcode version not done yet

    public static void findLongestSub(String s, int k){
        int i = 0, j = 0, max = -1;
        HashMap<Character, Integer> map = new HashMap<>();

        while (j < s.length()) {
            char c = s.charAt(j);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }

            if (map.get(c) < k) {
                j++;
            }else if (map.get(c) >= k) {
                max = Math.max(max, j - i + 1);
                i++;
                j++;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        findLongestSub("ababbc", 2);
    }
}
