package arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    /*
     * https://leetcode.com/problems/spiral-matrix/
     */

    ArrayList<Integer> result;

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        result = new ArrayList<>();
        int i1 = 0, i2 = m - 1;
        int j1 = 0, j2 = n - 1;
        while (i1 <= i2 && j1 <= j2) {
            append(matrix, i1++, i2--, j1++, j2--);
        }
        return result;
    }

    private void append(int[][] matrix, int i1, int i2, int j1, int j2) {
        if (i1 == i2) {
            for (int j = j1; j <= j2; j++) {
                result.add(matrix[i1][j]);
            }
            return;
        }

        if (j1 == j2) {
            for (int i = i1; i <= i2; i++) {
                result.add(matrix[i][j1]);
            }

            return;
        }

        for (int j = j1; j < j2; j++) {
            result.add(matrix[i1][j]);
        }
        for (int i = i1; i < i2; i++) {
            result.add(matrix[i][j2]);
        }
        for (int j = j2; j > j1; j--) {
            result.add(matrix[i2][j]);
        }
        for (int i = i2; i > i1; i--) {
            result.add(matrix[i][j1]);
        }
    }
}
