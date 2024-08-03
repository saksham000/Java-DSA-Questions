import java.util.*;
public class bubble2 {
    public static void main(String arg []){
        System.out.println("Enter the size of array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] = new int[20];
        int temp = 0;

        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }
        for(int i=0;i<size -1;i++){
            for(int j=0;j<size -i -1;j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Sortted array is");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }input.close();
    }
}
