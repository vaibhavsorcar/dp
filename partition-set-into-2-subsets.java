import java.util.*;
public class Main {
    static int func(ArrayList<Integer> arr, int n) {
        int totSum = arr.stream().mapToInt(Integer::intValue).sum(); 
        boolean[] dp = new boolean[totSum + 1]; // One-dimensional DP array

        dp[0] = true; 
        for (int num : arr) {
            for (int j = totSum; j >= num; j--) {
                dp[j] |= dp[j - num]; 
            }
        }
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i <= totSum / 2; i++) { 
            if (dp[i]) {
                mini = Math.min(mini, Math.abs(totSum - 2 * i));
            }
        }
        return mini;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4,5));
        System.out.println("The minimum absolute difference is: " + func(arr, arr.size()));
    }
}
