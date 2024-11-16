//Write a program to reverse the array
import java.util.*;
public class revarray {
    public static void main(String arg []){
        System.out.println("Enter the size of array");

        int array[] = new int[20];
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        System.out.println("Enetr the elements of array");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }
        System.out.println("The reverse array is");
        for(int i=size -1;i>=0;i--){
            System.out.println(array[i]);
        }input.close();
    }
}
