class solution{
public static int func(int n, int heights[], int[] dp){
  if(n==0) return 0;
  int ans = 0 , x  = INTEGER.MIN_VALUE, y = INTEGER.MAX_VALUE;
  if(dp[n]!=-1)
    return dp[n];
  x = func(n-1, heights, dp) + Math.abs(height[n] - heights[n-1]);
  if(n>1){
    y =  func(n-2, heights, dp) + Math.abs(height[n] - heights[n-2]);
  }
  return Math.min(x,y);
  }
}
