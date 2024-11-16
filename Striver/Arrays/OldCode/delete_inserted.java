//delete inserted number and shift other
import java.util.*;
public class delete_inserted {
    public static void main(String arg []){
        System.out.println("Enter the size of array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int r = 0;
        int array[] = new int[10];
        int array2[] = new int[10];

        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
            array2[i] = array[i];
        }
        System.out.println("Elements you have entered are");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
        System.out.println("Enter the element you want to delete");
        int n = input.nextInt();

        for(int i=0;i<size;i++){
            if(array[i] == n){
                array[i] = array[i+1];
                r = i;
            }
        }
        System.out.println("elements after delete are");
        for(int i=r+1;i<size-1;i++){
            array[i] = array2[i+1];
        }
        for(int i=0;i<size-1;i++){
            System.out.println(array[i]);
        }input.close();
    }
}
