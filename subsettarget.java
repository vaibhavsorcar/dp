class TUF {
    static boolean func(int ind, int target, int[] arr, int[][] dp) {
        if (target == 0) return true;
        if (ind == 0) return arr[0] == target;
        if (dp[ind][target] != -1) return dp[ind][target] == 1;
        
        boolean taken = false;
        boolean nottaken = func(ind - 1, target, arr, dp);
        if (arr[ind] <= target)
            taken = func(ind - 1, target - arr[ind], arr, dp);
        
        dp[ind][target] = taken || nottaken ? 1 : 0;
        return taken || nottaken;
    }
}
