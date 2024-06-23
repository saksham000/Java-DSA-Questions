//print sum of first n natural numbers
import java.util.*;
public class forloop3 {
    public static void main(String arg []){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rage of numbers");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println(sum);
        input.close();
    }
}
