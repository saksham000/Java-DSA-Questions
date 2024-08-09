//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
//1 : + (Addition) a + b
//2 : - (Subtraction) a - b
//3 : * (Multiplication) a * b
//4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

import java.util.*;

public class cal2 {
    public static void main(String arg []){
        System.out.println("Enter your two numbers");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Enter your option you want");
        int num = input.nextInt();

        switch(num){
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : System.out.println(a/b);
            break;
            case 5 : System.out.println(a%b);
            break;
            default : System.out.println("Inavlid Number");
            input.close();
        }
    }
}