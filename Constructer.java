class const1{
    String name;
    int x;
    boolean flag;
    const1(){
        System.out.println("The constructor is called");
        name = "Saksham";// constructors having no parameter are called no arg constructor
    }
    public const1(int a){//parameterised constructor and here constructor overloading is done
        x = a;
        System.out.println("This is overloaded constructor ");
    }
}
public class Constructer{
    public static void main(String arg[]){
        const1 obj = new const1();
        System.out.println("My name is " + obj.name);

        const1 obj2 = new const1(20);
        System.out.println("The value is " + obj2.x);

        const1 obj3 = new const1();//default constructor is called
        System.out.println(obj3.flag);
    }
}