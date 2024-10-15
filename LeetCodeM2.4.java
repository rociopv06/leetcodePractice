//https://leetcode.com/problems/rotate-image
class Solution {
    public void rotate(int[][] matrix) {
        
        int top = 0;
        int left = 0;
        int bottom = matrix.length-1;
        int right = matrix.length-1;
        int pixelsToBeRotated =  matrix.length*matrix.length;
        ArrayList<Integer> topArray = new ArrayList<Integer>();
        ArrayList<Integer> leftArray = new ArrayList<Integer>();
        ArrayList<Integer> rightArray = new ArrayList<Integer>();
        ArrayList<Integer> bottomArray = new ArrayList<Integer>();
        while(pixelsToBeRotated>1) {
            System.out.println("run" + pixelsToBeRotated);
            for(int i = 0; i <= bottom-top; i++) {
                topArray.add(matrix[top][left+i]);
                leftArray.add(matrix[bottom-i][left]);
                rightArray.add(matrix[top+i][right]);
                bottomArray.add(matrix[bottom][right-i]);
            }
            for(int i = 0; i <= bottom-top; i++) {
                matrix[top][left+i] = leftArray.get(i);
                matrix[bottom-i][left] = bottomArray.get(i);
                matrix[top+i][right] = topArray.get(i);
                matrix[bottom][right-i] = rightArray.get(i);
            }
            pixelsToBeRotated -= (topArray.size()*4 - 4);
            top++;
            left++;
            bottom--;
            right--;
            topArray.clear();
            leftArray.clear();
            rightArray.clear();
            bottomArray.clear();
        }
    }
}
