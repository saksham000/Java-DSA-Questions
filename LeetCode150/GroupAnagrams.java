package LeetCode150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> findGroupOfAna(String[] strs){

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i =0 ;i<strs.length;i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(findGroupOfAna(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
