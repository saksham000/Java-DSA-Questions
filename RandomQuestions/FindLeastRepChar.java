package RandomQuestions;
import java.util.HashMap;
public class FindLeastRepChar {

    public static void findChar(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }

        //find least rep character

        char leastRepChar = '\0';
        int minCount = Integer.MAX_VALUE;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int count = map.get(c);
                if(count < minCount){
                    minCount = count;
                    leastRepChar = c;
                }
            }
        }
        System.out.println("least rep char is "+ leastRepChar + " the count is " + minCount);

    }


    public static void main(String[] args) {
        String s = "abbaaccdecd";
        findChar(s);


    }
}
