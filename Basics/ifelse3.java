//wap a code take user input using if else and check if a=b then equal a>b a is greater a<b a is lesser
import java.util.*;
public class ifelse3 {
    public static void main(String arg []){
        System.out.println("Enter the value of a and b");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a==b){
            System.out.println("a is equal");
        }
        else if(a>b){
                System.out.println("a is greater");
            }
            else{
                System.out.println("a is lesser");
            }
            input.close();
        }
    }

