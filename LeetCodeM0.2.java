//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/?envType=problem-list-v2&envId=sliding-window
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int selectedSum = 0;
        int reached = 0;
        int minSum = Integer.MAX_VALUE;
        int left=0;
        int total = 0;
        if(k>=cardPoints.length) {
            for(int point:cardPoints){
                total +=point;
            }
            return(total);
        }
        for(int right= 0; right<cardPoints.length; right++){
            selectedSum+=cardPoints[right];
            System.out.println(cardPoints[right]);
            reached++;
            if(reached == cardPoints.length-k){
                reached -= 1;
                System.out.println(selectedSum);
                minSum = Math.min(minSum, selectedSum);
                selectedSum -= cardPoints[left];
                left++;
            }
        }
