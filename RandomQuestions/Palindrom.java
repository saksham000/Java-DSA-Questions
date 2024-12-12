package RandomQuestions;

public class Palindrom {
    

    public static boolean isPalindrom(String s){
        boolean isPal = true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != s.charAt(s.length() -1 -i)){
                isPal = false;
                break;
            }
        }
        return isPal;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("naman"));
    }


}
