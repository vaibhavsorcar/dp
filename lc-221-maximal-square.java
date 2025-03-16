class dp{
  public static int func(char[][] matrix){
    if(matrix.length == 0 || matrix[0].length == 0)
      return 0;
    int rows = matrix.length;
    int cols = matrix[0].length;
    int max = 0;
    int dp[][] = new int[rows][cols];
    for(int i= 0 ;  i< rows; i++){
      for(int j = 0 ; j < cols; j++){
        if(matrix[i][j] == '1'){
          if(i == 0 || j == 0){
            dp[i][j] = 1;
          }
          else{
            dp[i][j] = Math.min(Math.min(dp[i-1][j], d[[i][j-1]), dp[i-1][j-1]) +1;
          }
        max = Math.max(max, dp[i][j]);
        }
      }
    }
    return max*max;
  }
}
