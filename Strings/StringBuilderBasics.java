package Strings;

public class StringBuilderBasics {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("saksham");
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        // This is how to set character at a Specific index
        sb.setCharAt(0, 'a');
        System.out.println(sb);

        // This is how to insert a character at Specific index
        sb.insert(0,'S');
        System.out.println(sb);

        // This is how to delete a (part) of a String
        sb.delete(1, 2);
        System.out.println(sb);
        
        // This is how to append a string at the end of a string
        sb.append("Sharma");
        System.out.println(sb);
    }
}
