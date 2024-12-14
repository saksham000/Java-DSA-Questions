package RandomQuestions.Revision;

import java.util.HashMap;

public class FindLeastFreqChar {

    public static void findChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }

        char leastFreqChar = '\0';
        int minCount = Integer.MAX_VALUE;
        boolean isPresent = false;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int count = map.get(c);
                if(count < minCount){
                    minCount = count;
                    leastFreqChar = c;
                    isPresent = true;
                }
            }
        }
        if(isPresent)
        System.out.println("least char is "+ leastFreqChar + " count is " + minCount);
        else
        System.out.println("-1");
    }

    public static void main(String[] args) {
        String s = "aabccbaabdddbedd";
        findChar(s);
    }

}
