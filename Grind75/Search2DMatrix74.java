class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null)
        {
            return false;
        }

        int i=0, left = 0, right = matrix[0].length-1;

        while(i < matrix.length && left <= right)
        {
            int mid = left + (right - left)/2;
         
            if(matrix[i][mid] == target)
            {
                return true;
            }
            else if(matrix[i][mid] < target)
            {
                //target greater than mid and last element in same row
                // move to next row 
                if(target > matrix[i][right])
                {
                    left=0; right=matrix[i].length-1; i++;
                }
                //else move right in same row
                else{
                    left = mid + 1;
                } 
            }
            else
            {
                right = mid - 1;
            }
        }

        return false;
        
    }
}