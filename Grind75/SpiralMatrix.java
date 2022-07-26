public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        
        int left=0,right=matrix[0].length-1;
        int top=0,bottom=matrix.length-1;
        
        List<Integer> ans=new ArrayList<>();
        
        while(left<=right && top<=bottom){
            
            //First row
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            
            top++;
            
            //Last column
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
        
            
            if(!(left<=right && top<=bottom)){
                break;
            }
            
            //Last row
            for(int i=right;i>=left;i--){
                ans.add(matrix[bottom][i]);
            }
            bottom--;
            
            //First column
            for(int i=bottom;i>=top;i--){
                ans.add(matrix[i][left]);
            }
            left++;
        }
        
        return ans;
        
        
    }
    
}
