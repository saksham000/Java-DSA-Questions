//wap a code to ask user age if he is adult or not using if else
import java.util.*;

public class ifelse1 {
    public static void main(String arg []){
        System.out.println("Please enter your age");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age >= 18) {
            System.out.println("Yes you are Adult");
        }
        else {
            System.out.println("No you are not Adult");
            input.close();
        }
    }
}