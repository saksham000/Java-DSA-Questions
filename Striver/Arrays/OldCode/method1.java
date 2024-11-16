// add two num with method
import java.util.*;
class addnumbers{
    public int method(int x,int y){ //if we write int in method we have to return something
        int sum = x + y;
        return sum;
    }
}
public class method1{
    public static void main(String arg[]){
        System.out.println("Enter the two numbers");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int num2 = input.nextInt();
        addnumbers obj = new addnumbers();
        int result = obj.method(num,num2);
        input.close();

        System.out.println("The sum numbers are " + result);
    }  
}