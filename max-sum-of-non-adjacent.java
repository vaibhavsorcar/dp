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
