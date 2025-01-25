package LeetCode150;

public class GenerateParentheses {

    public static void generateParen(int openP, int closeP, String s, int n) {
        if (openP == closeP && openP + closeP == n * 2) {
            System.out.println(s);
            return;
        }

        if (openP < n) {
            generateParen(openP + 1, closeP, s + "(", n);
        }
        if (closeP < openP) {
            generateParen(openP, closeP + 1, s + ")", n);
        }
    }

    public static void main(String[] args) {
        generateParen(0, 0, "", 3);
    }
}
