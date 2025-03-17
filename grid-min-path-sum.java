import java.util.*;
class TUF {
    static int sum(int i, int j, int[][] matrix, int[][] dp) {
        if (i == 0 && j == 0)
            return matrix[0][0]; 
        if (i < 0 || j < 0)
            return Integer.MAX_VALUE;
        if (dp[i][j] != -1)
            return dp[i][j]; 

        int up = matrix[i][j] + sum(i - 1, j, matrix, dp);
        int left = matrix[i][j] + sum(i, j - 1, matrix, dp);
        return dp[i][j] = Math.min(up, left);
    }

    static int minSumPath(int n, int m, int[][] matrix) {
        int[][] dp = new int[n][m];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return sum(n - 1, m - 1, matrix, dp);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {5, 9, 6},
            {11, 5, 2}
        };
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.println("Minimum sum path: " + minSumPath(n, m, matrix));
    }
}
