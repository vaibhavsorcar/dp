class sol{
main(){
  int arr[] = {2,3,4,5,6};
  func1(arr.length, arr);
}
func1(int n , int arr[]){
  int dp[] = new int[n];
  return func2(n-1, dp, arr); // pass the last index of the array to beign the search.
}

func2(int ind, int dp[], int arr[]){
  if(ind < 0)
    return 0;
  if(ind == 0)
    return arr[ind];
  if(ind != -1)
    return dp[n];
  int pick  = arr[ind] + func2(ind-2, dp, arr);
  int notpick = func2(ind-1, dp, arr);
  return Math.max(pick, notpick);
  }
}


----------------------------------------------------------------------------------------------------------------------->
  //tabulation method
  func1(int n, int arr[]){
  int dp = new int[n];
  return func2(dp, arr, n);
}
func2(int dp[], int arr[], int idx){
  if(ind < 0)
    return 0;
  arr[0] = 0;
  for(int i = 1; i < n ; i++){
    int pick = arr[i];
    if(i>1)
      pick += dp[i-2]
    int not = arr[i-1];
      dp[i] = Math.max(pick, not);
    }
  return dp[i-1] ;
}

    
  
