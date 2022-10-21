public /*class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        //if k=0 add base case
        
        List<List<Integer>> ans=new ArrayList<>();
        int m=grid.length, n=grid[0].length;
        
        for(int i=0;i<m;i++){
            ans.add(i,new ArrayList<Integer>());
            
            for(int j=0;j<n;j++){
                ans.get(i).add(j,grid[i][j]);
            }
        }
        
        int iter=0;
        
        while(iter<k){
            
            int case3=ans.get(m-1).get(n-1);
            ans.get(0).add(0,case3);
            ans.get(m-1).remove(n-1);
            
            for(int i=0;i<m-1;i++){
                int case2=ans.get(i).get(n);
                ans.get(i+1).add(0,case2);                                
                ans.get(i).remove(n);
            }
            
            System.out.println(ans.toString());
            
            iter++;
        
        }
        
        return ans;
        
        
        
        
    
    }
}*/
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m*n;
        // the following is done to make sure that you dont rotate more than total number of times.
        k = k % total;
        List<List<Integer>> list = new ArrayList<>();
        // create arraylist for each row.
        for(int i = 0; i < m; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < total; i++) {
            // the index below is used to calculate m and n position
            // for a given row, m = index/n, n = index%n
            // this is while trying to iterate the array as a 1D array
            // with index pointing to current index of the imaginary single dimension array
            int index = (total - k + i) % total;
            // i%n gives you the list bucket to which the element should be added.
            list.get(i/n).add(grid[index/n][index%n]);
            
        }
        return list;
    }
} Shift2DGrid {
    
}
