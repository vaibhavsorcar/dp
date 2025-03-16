// memoization approach - top down approach
class solution {
  public int func(int n){
    Map<Intger, Integer> map = new HashMap<>();
    return func2(n, map);
  }
  public int func2(int n, Map<Integer, Integer> map){
    if(n ==0 || n == 1)
      return 1;
    if(!map.containsKey(n)){
      map.put(n, func2(n-1, map) + func2(n-2, map));
    }
    return map.get(n);
  }
}

//tabulation - bottom-up approach
class solution{
  public int func1(int n){
    int dp[] = new int[n];
    dp[0] = dp[1] = 1;
    for(int i = 2; i <= n; i++){
      dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
  }
}

// recursion
class sol{
  int func(int n){
    if(n==0 || n==1)
      return 1;
    return func(n-1)+func(n-2);
  }
}

// space optimization approach
class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
      int prev = 1, curr = 1;
      for(int i = 2 ; i < =n ; i++){
        int temp = curr;
        curr = curr + prev;
        prev = temp;
      }
      return curr;
    }
}
