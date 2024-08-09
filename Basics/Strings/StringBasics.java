package Strings;
                // Java Strings are Immutable we can not change,delete,add to a string so we use string builder for that.
public class StringBasics {
    public static void main(String[] args) {
        String firstName = "saksham";
        String lastName = "sharma";
        String fullName = firstName + lastName;

        // charAt is use to pick the one character at that specific index value
        for (int i = 0; i < fullName.length(); i++) {
            // System.out.println(fullName.charAt(i));
        }

        // This is how to compare two strings

        String name1 = "saksham";
        String name2 = "saksham";

        // This what compare to checks
        // If the s1 > s2 : it will print +ve value
        // If the s1 < s2 : it will print -ve value
        // If the s1 == s2 : it will print 0 (it will compare the value of a character
        // like value of A is smaller that W)
        if (name1.compareTo(name2) == 0) {
            // System.out.println("Strings are equal");
        } else {
            // System.out.println("Strings are not equal");
        }

        // This is how to take part of a String

        String sentence = "My name is Saksham";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);

        // This is how to convert String into number and vice versa
        // This concept is known as praseing

        String str = "123";
        int num = 456;
        // This converts string into number
        int number = Integer.parseInt(str);
        // This converts integer into String
        String str2 = Integer.toString(num);

        System.out.println("This is a str to int number " + number);
        System.out.println("This is a int to str number " + str2);

    }
}
