//wap a code if number is odd or even
import java.util.*;

public class ifelse2 {
    public static void main(String arg []){
        System.out.println("Enter your number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
            input.close();
        }
    }
}
