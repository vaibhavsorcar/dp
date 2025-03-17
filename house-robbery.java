class solution{
  func1(int n, ArrayList<Integer> arr){
    if(n==1)
      return arr.get(0);
    ArrayList<Integer> a1 = new ArrayList<>();
    ArrayList<Integer> a2 = new ArrayList<>();
    for(int i = 0 ; i < n; i++){
      if(i!=0) a1.add(arr.get(i));
      if(i!=n-1) a2.add(arr.get(i));
    }
    long ans1 = func2(a1);
    long ans2 = func2(a2);
    return Math.max(ans1, ans2);
}

static long solve(ArrayList<Integer> arr) {
    int n = arr.size();
    long[] memo = new long[n];
    memo[0] = arr.get(0);
    for (int i = 1; i < n; i++) {
        long pick = arr.get(i);
        if (i > 1)
            pick += memo[i - 2];
        long nonPick = memo[i - 1];
        memo[i] = Math.max(pick, nonPick);
    }
    return memo[n - 1];
  }
}
