package RandomQuestions;
// https://leetcode.com/problems/determine-if-string-halves-are-alike/description/

public class StringHalvesALike {

    public static boolean isVowel(char s){
        if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U'){
            return true;
        }
        return false;
    }
    public static boolean halvesAreAlike(String s){
        int count = 0;
        for(int i=0;i<s.length()/2;i++){
            if(isVowel(s.charAt(i)))
            count++;
        }
        int count2 = 0;
        for(int i=s.length()/2;i<s.length();i++){
            if(isVowel(s.charAt(i)))
            count2++;
        }
        if(count == count2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }
}
