//print the table of number input by the user
import java.util.*;

public class forloop4 {
    public static void main(String arg []){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num of which table want");
        int num = input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num*i);
        }
        input.close();
    }
    }    

