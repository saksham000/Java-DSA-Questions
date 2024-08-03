import java.util.*;
public class nearsmall2 {
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        int array[] = new int[20];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }
        System.out.println("Nearest smaller numbers are");
        for(int i=1;i<size;i++){
            int j;
            for(j=i-1;j>=0;j--){
                if(array[j] < array[i]){
                    System.out.print(array[j] + ",");
                    break;
                }
            }
            if( j == -1){
                System.out.print("_,");
            }
        }input.close();
    }
}
