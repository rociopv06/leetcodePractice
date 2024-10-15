//https://leetcode.com/problems/spiral-matrix/description/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        int top = 0;
        int left = 0;
        int posVisited = 0;
        ArrayList<Integer> sol = new ArrayList<Integer>();
        while(posVisited<matrix.length*matrix[0].length) {
            for (int col = left; col<=right; col++) {
                sol.add(matrix[top][col]);
                posVisited++;
            }
            if (posVisited>=matrix.length*matrix[0].length) break;
            top++;
            for(int row = top; row <= bottom ; row++) {
                sol.add(matrix[row][right]);
                posVisited++;
            }
            if (posVisited>=matrix.length*matrix[0].length) break;
            right--;
            for(int col = right; col>=left; col--) {
                sol.add(matrix[bottom][col]);
                posVisited++;
            }
            if (posVisited>=matrix.length*matrix[0].length) break;
            bottom--;
            for (int row = bottom; row>=top; row--) {
                sol.add(matrix[row][left]);
                posVisited++;
            }
            if (posVisited>=matrix.length*matrix[0].length) break;
            left++;
        }
        return sol;
    }
}
