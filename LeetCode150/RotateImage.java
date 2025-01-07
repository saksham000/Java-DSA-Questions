package LeetCode150;

import java.util.Arrays;

public class RotateImage {
    
    public static void rotateImage(int[][] mat){

        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[0].length; j++) {
                int temp = 0;
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            int left = 0, right = mat[0].length -1;
            while (left < right) {
                int temp = 0;
                temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }

    public static void main(String[] args) {
        rotateImage(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
