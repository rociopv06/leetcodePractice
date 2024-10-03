//https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/description/
//Sorting
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length) {
            return false;
        }
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            if(target[i]!=arr[i]) return false;
        }
        return true;
    }
}
//HashMap (unneccessarily complex)
class Solution {
  public boolean canBeEqual(int[] array_a, int[] array_b){
    HashMap<Integer, Integer> contained = new HashMap<>();
    if(array_a.length != array_b.length) {
      return false;
    }
    for(int element_a : array_a) {
      int value = 0;
      if (contained.containsKey(element_a)) value = contained.get(element_a);
      contained.put(element_a, value + 1);
    }
    for(int element_b : array_b) {
      if(contained.containsKey(element_b)){
        int value = contained.get(element_b);
        contained.remove(element_b);
        if (value>1) contained.put(element_b, value-1);
      }
      else {
        return false;
      }
    }
    if(contained.size()!=0) {
      return false;
    }
    return true;
  }
}
