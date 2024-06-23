import java.util.*;
public class linear {
    public static void main(String arg []){
        System.out.println("Enter the size of array");
        
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] = new int[size];

        System.out.println("Enter the elements of array");

        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }
        System.out.println("Enter the number you want to search");
        int n = input.nextInt();
        
        System.out.println("The number is at ");
        for(int i=0;i<size;i++){
            if(n==array[i]){
                System.out.println(i+1);
                break;
            }
        }input.close();
    }
    
}
