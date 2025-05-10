public class Palindrom {
    
    public static Boolean isPal(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPal("naman"));
    }
}
