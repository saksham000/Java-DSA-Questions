import java.util.*;
public class deletiones2 {
    public static void main(String arg []){
        System.out.println("Enter the size of array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] = new int[20];
        int array2[] = new int[20];
        int s = 0;

        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
            array2[i] = array[i];
        }
        System.out.println("Enter the element you want to delete");
        int n = input.nextInt();

        for(int i=0;i<size;i++){
            if(array[i] == n){
                array[i] = array[i+1];
                s = i;
            }
        }
        System.out.println("Number after delete are");
        for(int i=s+1;i<size-1;i++){
            array[i] = array2[i+1];
        }
        for(int i=0;i<size-1;i++){
            System.out.println(array[i]);
        }input.close();
    }
    
}
