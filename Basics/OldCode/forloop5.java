//Print all even numbers till n.
import java.util.*;

public class forloop5 {
    public static void main(String arg []){
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=2;i<=n;i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }input.close();
    }
}