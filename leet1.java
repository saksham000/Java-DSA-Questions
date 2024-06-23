import java.util.*;
public class leet1 {
    public static void main(String arg[]){
        System.out.println("Enter the size of array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] = new int[20];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }
        System.out.println("Enter the target value");
        int target = input.nextInt();

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[i]+array[j] == target){
                    System.out.println("the two elements are at " + i + " " + j);
                    break;
                }else if(array[i] == size-1){
                    System.out.println("the sum of target value is not found");
                    
                }
            }
        }
        
    }
}
