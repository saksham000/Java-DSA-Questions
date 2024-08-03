//wpa a code using else if 1 = hello,2 = namaste,3 = bonjour
import java.util.*;

public class elseif {
    public static void main(String arg []){
        System.out.println("Press 1 or 2 or 3");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num == 1){
            System.out.println("Hello");
        }
        else if(num == 2){
            System.out.println("Namaste");
        }
        else if(num == 3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid Number");
            input.close();
        }
    }
}
