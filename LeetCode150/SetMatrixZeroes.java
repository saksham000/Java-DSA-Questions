package LeetCode150;

public class SetMatrixZeroes {
    
    public static void setMatrix(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;

        int col0 = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j == 0) {
                        col0 = 0;
                    }else{
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        // marking the 1 to 0
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        
        if (col0 == 0) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }

        // handeling row and col sperately
        if (matrix[0][0] == 0) {
            for (int i = 0; i < col; i++) {
                matrix[0][i] = 0;
            }
        }


        for (int[] x : matrix) {
            for (int elem : x) {
                System.out.print(elem + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        
    }


    public static void main(String[] args) {
        setMatrix(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }
}
