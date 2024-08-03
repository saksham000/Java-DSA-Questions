//print -ve elements one side but with sorting
import java.util.*;
public class neg {
    public static void main(String arg []){
    System.out.println("Enter the size of array");
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int array[] = new int[20];
    int temp = 0;

    System.out.println("Enter the elemnts of array");
    for(int i=0;i<size;i++){
        array[i] = input.nextInt();
    }
    for(int i=0;i<size -1;i++){
        for(int j=0;j<size -1 -i;j++){
            if(array[j] > array[j+1]){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
    System.out.println("The sorted array");
    for(int i=0;i<size;i++){
        System.out.println(array[i]);
        }input.close();
    }
}
