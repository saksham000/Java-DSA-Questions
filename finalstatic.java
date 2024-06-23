public class finalstatic {
    public void method(){
        System.out.println("This is called by Object");
    }
    static void method2(){
        System.out.println("This is called without a object");
    }
    public static void main(String arg []){
        finalstatic obj = new finalstatic();
        obj.method();
        method2();
    }
}
