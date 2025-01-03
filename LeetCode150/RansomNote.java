package LeetCode150;

import java.util.HashMap;

public class RansomNote {
    
    public static void doesMatch(String ran, String mag){
        HashMap<Character, Integer> map2 = new HashMap<>();
        boolean canIt = false;

        for(int i = 0;i<mag.length();i++){
            char c = mag.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }

        for(int i = 0;i<ran.length();i++){
            char c = ran.charAt(i);
            if (map2.containsKey(c) && map2.get(c) > 0) {
                map2.put(c, map2.get(c) - 1);
            }else{
                canIt = false;
            }
        }

        System.out.println(canIt == false ? false : canIt);
    }

    public static void main(String[] args) {
        doesMatch("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj");
    }
}
