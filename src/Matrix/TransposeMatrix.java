package Matrix;

// Que Link: https://leetcode.com/problems/transpose-matrix/

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] ans =transpose(matrix);
    }

    private static int[][] transpose(int[][] matrix) {
        int R = matrix.length, C = matrix[0].length;
        int[][] ans = new int[C][R];
        for (int r = 0; r < R; ++r) {
            for (int c = 0; c < C; ++c) {
                ans[c][r] = matrix[r][c];
            }
        }
        return ans;
    }
}
