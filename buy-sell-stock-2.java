class solution{
  public getMaximumProfitUtil(int arr[], int ind, int buy, int dp[][]){
  if(ind == arr.length) return 0;
  if(dp[ind][buy] != -1) return dp[ind][buy];
  long profit = (buy == 0)? 
    Math.max(getMaximumProfitUtil(arr, ind+1, 0, dp), -arr[ind] + getMaximumProfitUtil(arr, ind+1, 1, dp):
    Math.max(getMaximumProfitUtil(arr, ind+1, 1, dp), arr[ind] + getMaximumProfitUtil(arr,  ind+1, 0, dp);
    dp[ind][buy] = profit;
  }
    
static long getMaximumProfit(long[] Arr) {
        int n = Arr.length;
        long[][] dp = new long[n][2];
        for (long[] row : dp) Arrays.fill(row, -1);

        return getMaximumProfitUtil(Arr, 0, 0, dp);
    }

    public static void main(String[] args) {
        long[] Arr = {7, 1, 5, 3, 6, 4};
        System.out.println("The maximum profit that can be generated is " + getMaximumProfit(Arr));
    }
}
