//wap a code to check the number is even or odd
import java.util.*;
public class prac1 {
    public static void main(String arg []){
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n % 2 == 0){
            System.out.println(n +" The number is even");
        }
        else{
            System.out.println(n +" The number is odd");
            input.close();
        }
    }
}
