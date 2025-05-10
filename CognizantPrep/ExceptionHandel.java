public class ExceptionHandel {

    public static void throwExcep() {
        try {
            int a = 10;
            int b = 0;
            int n = a / b;
        } catch (Exception e) {
            System.out.println("can not perform " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        throwExcep();
    }
}
