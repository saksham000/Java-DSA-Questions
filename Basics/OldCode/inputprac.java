// wap a code to take input from user for there name
import java.util.*;

public class inputprac {
    
    public static void main(String arg []){

        System.out.println("Please enter your name");
        Scanner input = new Scanner(System.in);
        String fullname = input.nextLine();
        System.out.println(fullname);
        
        System.out.println("Enter you name again");
        String nameagain = input.nextLine();
        System.out.println(nameagain);
        input.close();

    }
}
