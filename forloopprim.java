//wap a code to check if no is primwe or not
import java.util.*;
public class forloopprim {
    public static void main(String arg []){
        System.out.println("Enter the number ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int div = 0;
        for(int i=1;i<n;i++){
            if(n%i==0)
            div++;
        }
        if(div==2){
            System.out.println("Number is not prime");
        }else{
            System.out.println("Number is prime");
        }input.close();
    } 
}
