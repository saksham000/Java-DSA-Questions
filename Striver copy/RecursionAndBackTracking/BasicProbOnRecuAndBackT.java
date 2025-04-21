package Striver.RecursionAndBackTracking;

public class BasicProbOnRecuAndBackT {

    public static void printNameFiveTimes(int init, int max) {
        if (init > max) {
            return;
        }
        System.out.println("saksham");
        printNameFiveTimes(init + 1, max);
    }

    public static void printNtoOne(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printNtoOne(n - 1);
    }

    public static void printOneToNusingBackTrack(int n) {
        if (n < 1) {
            return;
        }
        printOneToNusingBackTrack(n - 1);
        System.out.println(n);
    }

    public static void printNtoOneUsingBackTrac(int i, int n) {
        if (i > n) {
            return;
        }
        printNtoOneUsingBackTrac(i + 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        // printNameFiveTimes(1, 3);
        // printNtoOne(3);
        // printOneToNusingBackTrack(3);
        printNtoOneUsingBackTrac(1, 3);
    }
}
