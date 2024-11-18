import java.util.*;
public class array{
    public static void main(String arg []){
        System.out.println("Enter the lenght of array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();

        }input.close();
        
        System.out.println("The numbers you entered are");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}