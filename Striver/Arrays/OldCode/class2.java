import java.util.*;
class class2{
    public static void main(String arg []){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the car name");
        String n = input.nextLine();
        
        System.out.println("Enter the speed of car");
        
        int s = input.nextInt();
        class1 obj = new class1();
        
        obj.carname(n);
        obj.topspeed(s);
        input.close();
    }
}