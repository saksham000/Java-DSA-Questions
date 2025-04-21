package Striver.RecursionAndBackTracking;

public class SumOfFirstNnumbers {
    
    public static int getSum(int n){
        if (n == 0) {
            return 1;
        }
        return n * getSum(n - 1); //  * gives factorial but top return should return 1 not 0
    }

    public static void main(String[] args) {
        System.out.println(getSum(4));
    }
}
