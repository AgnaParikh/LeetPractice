class Solution {    
    int Area;
    public int maxAreaOfIsland(int[][] grid) {
        
        int maxArea=0;
        
        if(grid.length==0){
            return 0;
        }
        
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                
                if(grid[i][j]==1){
                    int x=dfs(grid,i,j);
                    if(maxArea<x){
                        maxArea=x;
                    }
                }
            }
        }
        
        return maxArea;
        
    }
    
    private int dfs(int[][] grid, int r,int c){
        
        if((r>grid.length-1 || r<0) || (c>grid[0].length-1 || c<0)){
            return 0;
        }
        
        if(grid[r][c]==0){
            return 0;
        }
        
        grid[r][c]=0;

        
        return (dfs(grid,r-1,c)+dfs(grid,r+1,c)
        +dfs(grid,r,c-1)
        +dfs(grid,r,c+1)+1);
        

    }
}