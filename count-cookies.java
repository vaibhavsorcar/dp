class solution{
  public func(int s, int g){
    Arrays.sort(s);
    Arrays.sort(g);
    int right = 0;
    for(int left = 0 ; left < s.length && right < g.length; left++ ){
      if(s[left] >= g[right]){
        right++;
      }
    }
      return right;
    }
  }
