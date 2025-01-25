package LeetCode150;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static void findCombi(int idx, List<Integer> combi, int n, int k) {
        if (combi.size() == k) {
            for (int i : combi) {
                System.out.print(i);
            }
            System.out.print(",");
            return;
        }
        for (int i = idx; i <= n; i++) {
            combi.add(i);
            findCombi(i + 1, combi, n, k);
            combi.remove(combi.size() - 1);
        }
    }

    public static void main(String[] args) {
        findCombi(1, new ArrayList<>(), 4, 2);
    }
}
