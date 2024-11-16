import java.util.*;
public class star1 {
    public static void main(String arg []){
        System.out.println("Enter the size of triangle");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }input.close();
    }
}