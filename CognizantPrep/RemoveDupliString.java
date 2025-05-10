import java.util.HashMap;
import java.util.Map;

public class RemoveDupliString {

    public static void removeDupli(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        removeDupli("aabbcdee");
    }
}
