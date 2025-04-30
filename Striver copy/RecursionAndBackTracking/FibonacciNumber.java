package Striver.RecursionAndBackTracking;

public class FibonacciNumber {
    
    public static int findFibo(int n){
        if (n <= 1) {
            return n;
        }
        int last = findFibo(n-1);
        int sLast = findFibo(n-2);
        return last + sLast;
    }

    public static void main(String[] args) {
        System.out.println(findFibo(4));
    }
}