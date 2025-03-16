class sol{
  public static int f(int dp[], int n){
    if(n<=1) return n;
    if(if dp[n] != -1) return dp[n];
    return dp[n] = f(dp, n-1) + f(dp, n-2);
  }
}

