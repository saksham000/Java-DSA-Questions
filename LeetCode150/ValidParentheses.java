package LeetCode150;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char i : s.toCharArray()) {
            if (i == '(' || i == '[' || i == '{') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char c = stack.pop();
                if ((i == ')' && c == '(') || (i == ']' && c == '[') || (i == '}' && c == '{')) {
                    continue;
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }

}
