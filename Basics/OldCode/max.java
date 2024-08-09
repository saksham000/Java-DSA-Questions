//find min and max number in a array
import java.util.*;
public class max {
    public static void main(String arg []){
        System.out.println("Enter the size of array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] = new int[20];
        int max = 0;

        System.out.println("Enter the element of array");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }

        for(int i=0;i<size;i++){
            if(array[i] > max){
                max = array[i];
            }
        }input.close();
        System.out.println("Maximum number is " + max);
    }
}
