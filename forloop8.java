//print all even number till n
import java.util.*;
public class forloop8 {
    public static void main(String arg []){
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }input.close();
        }
    }
}
