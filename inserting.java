// insert element at asked position
import java.util.*;
class inserting {
    public static void main(String arg []){
        System.out.println("Enter the size of aray");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] = new int[10];
        int array2[] = new int[10];
        
        System.out.println("Enter the elemets of array");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
            array2[i] = array[i];
        }
        
        System.out.println("Elements you have entered are");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
        System.out.println("Enter the element you want to insert");
        int n = input.nextInt();
        
        System.out.print("Enter the position where you want to replace ?");
        int p = input.nextInt();

        for(int i=0;i<size;i++){
            if(i==p-1){
                array[i] = n;
            }
        }
        for(int i=p;i<=size;i++){
            array[i] = array2[i-1];
            
        }
        for(int i=0;i<=size;i++){
            System.out.println(array[i]);
        }input.close();
    }
}