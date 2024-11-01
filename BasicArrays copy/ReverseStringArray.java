package BasicArrays;

import java.util.Arrays;

public class ReverseStringArray {
    public static void main(String[] args) {
        char[] c = { 'h', 'e', 'l', 'l', 'o' };
        char temp;
        for (int i = 0; i < c.length / 2; i++) {
            int front = i;
            int back = c.length - 1 - i;

            temp = c[front];
            c[front] = c[back];
            c[back] = temp;
        }

        System.out.println(Arrays.toString(c));
    }
}
