import java.util.*;
public class inserting2{
    public static void main(String arg []){
        System.out.println("Enter the sizeo of array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] = new int[20];
        int array2[] = new int[20];

        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
            array2[i] = array[i];
        }
        System.out.println("Enter the number you want to insert");
        int n = input.nextInt();

        System.out.println("Enter the position you want to insert");
        int p = input.nextInt();

        for(int i=0;i<=size;i++){
            if(i==p-1){
                array[i] = n;
            }
        }
        System.out.println("The elements after inserting is");
        for(int i=p;i<=size;i++){
            array[i] = array2[i-1];
        }
        for(int i=0;i<=size;i++){
            System.out.println(array[i]);
        }input.close();

    }
}