class key{
    int x;
    key(int x){
        this.x = x;
        System.out.println("The reference here is " + x);
    }
}
public class thiskey{
    public static void main(String arg[]){
        key obj = new key(10);
        System.out.println("The object reference is " + obj.x);
    }
}
//https://www.programiz.com/java-programming/this-keyword