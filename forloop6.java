//Qs. Print if a number is prime or not (Input n from the user).
import java.util.*;
public class forloop6 {
    public static void main(String arg []){
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int div = 0;
        for(int i=1;i<=n;i++){
            div++;
        }
        if(div==2){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
        input.close();
    }
}
