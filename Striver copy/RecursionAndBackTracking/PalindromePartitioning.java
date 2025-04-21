package Striver.RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    
    public static void findPart(String s, int idx, List<String> combi){
        if (idx == s.length()) {
            for(String i : combi){
                System.out.print(i + ",");
            }
            System.out.println();
            return;
        }
        for (int i = idx; i < s.length(); i++) {
            if (isPalin(s,idx,i)) {
                combi.add(s.substring(idx, i+1));
                findPart(s, i+1, combi);
                combi.remove(combi.size()-1);
            }
        }
    }
    public static boolean isPalin(String s,int start,int end){
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        findPart("aab", 0, new ArrayList<>());
    }
}
