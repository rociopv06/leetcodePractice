// 3. Longest Substring Without Repeating Characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0; 
        int maxSubstringSize = 1;

        HashMap<Character,Integer> hash = new HashMap();
        if(s.length()==0){
            return(0);
        }
        for(int right= 0; right < s.length(); right++){
            char r = s.charAt(right);
            hash.put(r, hash.getOrDefault(r,0)+1);
            while(hash.get(r)>1) {
                char l = s.charAt(left);
                hash.put(l, hash.getOrDefault(l,0)-1);
                left++;
            }
            maxSubstringSize = Math.max(maxSubstringSize, right-left+1);
        }
        
        return(maxSubstringSize);
    }
}
