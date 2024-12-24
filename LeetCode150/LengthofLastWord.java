package LeetCode150;

public class LengthofLastWord {

    public static void findLen(String s) {
        s=s.trim();
        String[] words = s.split(" ");

        
        
        System.out.println(words[words.length -1].length());
    }

    public static void main(String[] args) {
        findLen("   luffy is still joyboy    ");
    }
}
