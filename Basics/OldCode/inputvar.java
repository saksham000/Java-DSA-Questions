//wap code to take input of 2 variables a and b and print sum

import java.util.*;
public class inputvar {
    public static void main(String arg []){
        System.out.println("Enter your two numbers ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Your sum is");
        int sum = a+b;
        System.out.println(sum);
        input.close();

    }

}
