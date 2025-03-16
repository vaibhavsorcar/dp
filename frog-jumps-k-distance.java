class solution{
  public int func(int heights[], int dp[], int k, int ind){
   if(ind  == 0 )
     return 0
       if(dp[ind] != -1)
     return dp[ind];
    int msteps = INTEGER.MAX_VALUE;
    for(int  j = 1 ; j <= k; j++){
    if(ind - j >= 0) // not go beyond the first index
    {
      int jump = func(heights, dp, k , ind - j) + Math.abs(heights[ind] - heights[ind - j]);
      msteps = Math.min(jump, msteps);
      }
    }
    return dp[n] = msteps;
  }
}
