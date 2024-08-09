class overload{
    public static void method(int x,int y){
        System.out.println(x+y);
    }
    public static void method(int x,int y,int z){
        System.out.println(x+y+z);//same name but diff numbers of parameter
    }
    public static void method(int x,String y){
        System.out.println(x+y);//
    }
}
public class methover{
    public static void main(String arg[]){
        overload.method(10,20);
        overload.method(10,20,30);
        overload.method(50," Saksham");
    }
}