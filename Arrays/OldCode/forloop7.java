//check weather the number is prime or not
import java.util.*;
public class forloop7 {
    public static void main(String arg []){
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int div=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                div++;
            }
        }
        if(div==2){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
        input.close();
    }
    
}
