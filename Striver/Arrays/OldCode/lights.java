/*import java.util.*;
 class light{
     public void method1(){
         System.out.println("Lights Are On");
     }
     public void method2(){
         System.out.println("Lights Are Off");
     }
     public void method3(){
        System.out.println("Inavlid Command");
     }
 }
public class lights{
    public static void main(String arg[]){
        System.out.println("Enter the action you want to take");
        Scanner input = new Scanner(System.in);
        String act = input.nextLine();
        light action = new light();

        if(act.equals("on")){
            action.method1();
        }else if(act.equals("off")){
            action.method2();
        }else{
            action.method3();
        }input.close();
    }
}*/
import java.util.*;
 class light{
     public void method1(){
         System.out.println("Lights Are On");
     }
     public void method2(){
         System.out.println("Lights Are Off");
     }
     public void method3(){
        System.out.println("Inavlid command");
     }
 }
public class lights{
    public static void main(String arg[]){
        System.out.println("Enter the action you want to take");
        Scanner input = new Scanner(System.in);
        String act = input.nextLine();
        boolean flag = false;
        light action = new light();
        
        if(act.equals("on")){
            flag = true;
        }else if(act.equals("off")){
            flag = false;
        }else{
            action.method3();
        }
        if(flag == true){
            action.method1();
        }else if(flag == false){
          action.method2();
        }
        input.close();
    }
}