package LeetCode150;

import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean findIso(String s, String t) {

        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapS.containsKey(charS) && mapS.get(charS) != charT
                    || mapT.containsKey(charT) && mapT.get(charT) != charS) {
                return false;
            }

            mapS.put(charS, charT);
            mapT.put(charT, charS);
        }

        return true;

        // Easy Approch

        // HashMap <Character,Character> hm=new HashMap<>();
        // if(s.length()!=t.length())
        // return false;
        // for(int i=0;i<s.length();i++)
        // {
        // char s1=s.charAt(i);
        // char t1=t.charAt(i);
        // if(!hm.containsKey(s1))
        // {
        // if(!hm.containsValue(t1))
        // {
        // hm.put(s1,t1);
        // }
        // else
        // {
        // return false;
        // }
        // }
        // else
        // {
        // if(t1!=hm.get(s1))
        // return false;
        // }
        // }
        // return true;

    }

    public static void main(String[] args) {
        System.out.println(findIso("foo", "bar"));
    }
}
