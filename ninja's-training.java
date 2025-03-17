class Sol {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = arr.length;
        func(n, arr);
    }

    static void func(int n, int[][] arr) {
        // Input validation
        if (n == 0 || arr[0].length == 0) {
            System.out.println("Invalid input array");
            return;
        }

        int[][] dp = new int[n][3]; // Assuming 3 activities per day
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int max = 0;
        for (int i = 0; i < 3; i++) {
            max = Math.max(max, func2(n - 1, i, arr, dp));
        }
        System.out.println("Maximum value: " + max);
    }

    static int func2(int day, int last, int[][] arr, int[][] dp) {
        if (dp[day][last] != -1) return dp[day][last];

        if (day == 0) { // Base case: first day
            return dp[day][last] = arr[0][last];
        }

        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (i != last) {
                int activity = arr[day][i] + func2(day - 1, i, arr, dp);
                max = Math.max(max, activity);
            }
        }
        return dp[day][last] = max;
    }
}
