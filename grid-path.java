class Solution {
    public static void main(String[] args) {
        int m = 3, n = 2;
        System.out.println(solve(m, n));
    }

    static int solve(int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return func(m - 1, n - 1, dp);
    }

    static int func(int i, int j, int[][] dp) {
        if (i == 0 && j == 0) return 1; // Only one way to reach (0,0)
        if (i < 0 || j < 0) return 0; // Out of bounds

        // Memoization
        if (dp[i][j] != -1) return dp[i][j];

        // Recursive calls
        int up = func(i - 1, j, dp);
        int left = func(i, j - 1, dp);

        return dp[i][j] = up + left;
    }
}
--------------------------------------------------------->
// Grid problem-2
if(i < 0 || j < 0)
  return 0;
if(i == 0 && j == 0)
  return 1;
if(i>0 && j>0 && arr[i][j] == -1)
  return 0;
if(dp[i][j]!=-1)
  return dp[i][j];
int up = func(i-1, j, arr);
int left = func(i, j-1, arr);
return dp[i][j] = up + left;
