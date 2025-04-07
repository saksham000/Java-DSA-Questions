package Striver.RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class RatInAMaze {

    public static void solve(int i, int j, ArrayList<ArrayList<Integer>> mat, ArrayList<String> ans, int n, String move,
            int[][] vis) {
        if (i == n - 1 && j == n - 1) {
            ans.add(move);
            return;
        }

        // down
        if (i + 1 < n && vis[i + 1][j] == 0 && mat.get(i + 1).get(j) == 1) {
            vis[i][j] = 1;
            solve(i + 1, j, mat, ans, n, move + "D", vis);
            vis[i][j] = 0;
        }

        // left
        if (j - 1 >= 0 && vis[i][j - 1] == 0 && mat.get(i).get(j - 1) == 1) {
            vis[i][j] = 1;
            solve(i, j - 1, mat, ans, n, move + "L", vis);
            vis[i][j] = 0;
        }

        // right
        if (j + 1 < n && vis[i][j + 1] == 0 && mat.get(i).get(j + 1) == 1) {
            vis[i][j] = 1;
            solve(i, j + 1, mat, ans, n, move + "R", vis);
            vis[i][j] = 0;
        }

        // up
        if (i - 1 >= 0 && vis[i - 1][j] == 0 && mat.get(i - 1).get(j) == 1) {
            vis[i][j] = 1;
            solve(i - 1, j, mat, ans, n, move + "U", vis);
            vis[i][j] = 0;
        }
    }

    public static void findPath(ArrayList<ArrayList<Integer>> mat) {
        int n = mat.size();
        int[][] vis = new int[n][n];
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vis[0][0] = 0;
            }
        }
        if (mat.get(0).get(0) == 1) {
            solve(0, 0, mat, ans, n, "", vis);
        }
        for (String i : ans) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<>(Arrays.asList(1, 0, 0, 0)));
        mat.add(new ArrayList<>(Arrays.asList(1, 1, 0, 1)));
        mat.add(new ArrayList<>(Arrays.asList(1, 1, 0, 0)));
        mat.add(new ArrayList<>(Arrays.asList(0, 1, 1, 1)));

        findPath(mat);
    }
}
