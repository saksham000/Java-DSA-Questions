//wpa a code using switch--> 1 = hello,2 = namaste,3 = bonjour
import java.util.*;
public class switchc {
    public static void main(String arg []){
        System.out.println("Press 1 or 2 or 3");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        switch(num){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Number");
            input.close();
        }
    }
}
