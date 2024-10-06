//https://leetcode.com/discuss/interview-question/614096/facebook-recruiting-portal-passing-yearbooks

int[] findSignatureCounts(int[] arr) {
    int[] yearbooks = new int[arr.length];
    int[] step = new int[arr.length];
    int[] sol = new int[arr.length];
    for(int i = 0; i < arr.length; ++i){
      yearbooks[i] = arr[i];
    }
    boolean different = true;
    while(different) {
      for (int i = 0; i < arr.length; ++i) {
          if(step[arr[i]-1] != yearbooks[i]){
            sol[i]++;
          }
          step[arr[i]-1] = yearbooks[i];
        }
      for(int i = 0; i < arr.length; ++i) {
        yearbooks[i] = step[i];
        if(arr[i]!=yearbooks[i]) {
          different = true;
        } 
        else {
          different = false;
        }
      }
    }
    return sol;
  }
