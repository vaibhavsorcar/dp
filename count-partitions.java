import java.util.*;
class TUF {
    static int mod = (int) (1e9 + 7);
    static int func2(int ind, int target, int[] arr, int[] dp) {
        if (target == 0) return 1;
        if (ind == 0) return (arr[0] == target || target == 0) ? 1 : 0;

        if (dp[target] != -1) return dp[target];

        int nt = func2(ind - 1, target, arr, dp);
        int t = (arr[ind] <= target) ? func2(ind - 1, target - arr[ind], arr, dp) : 0;

        return dp[target] = (nt + t) % mod;
    }

    static int func(int d, int[] arr) {
        int totSum = Arrays.stream(arr).sum();
        if (totSum - d < 0 || (totSum - d) % 2 != 0) return 0;

        int s2 = (totSum - d) / 2;
        int[] dp = new int[s2 + 1];
        Arrays.fill(dp, -1);

        return func2(arr.length - 1, s2, arr, dp);
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 6, 4};
        int d = 3;

        System.out.println("The number of subsets found are " + func(d, arr));
    }
}
