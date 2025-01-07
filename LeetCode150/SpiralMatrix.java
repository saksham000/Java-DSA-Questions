package LeetCode150;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void printSpiral(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int top = 0, left = 0, right = col - 1, bottom = row - 1;
        List<Integer> ans = new ArrayList<>();
        
        while (left <= right && top <= bottom) {
            // left to right
            for (int i = left; i <= right; i++) {
                ans.add(mat[top][i]);
            }
            top++;
            // top to bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;
            // right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                // bottom to top
                for (int i = bottom; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        System.out.println(ans.toString());
    }

    public static void main(String[] args) {
        printSpiral(new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } });
    }
}
