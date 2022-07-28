public class NumberOfIslands {

        public int numIslands(char[][] grid) {
            
            int numberOfIslands=0;
            
            if(grid==null){
                return 0;
            }
            
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    
                    if(grid[i][j]=='1'){
                        //call bfs
                        BFS(i,j,grid);
                        //increment number of islands
                        numberOfIslands++;
                    }
    
                }
            }
            
            return numberOfIslands;
            
        }
        
        private void BFS(int row,int col,char[][] grid){
            
            //Base cases
            //1. out of boundary
            if(row<0 || row>=grid.length || col<0 || col>=grid[0].length){
                return;
            }
            
            //2. if value is 0
            if(grid[row][col]=='0'){
                return;
            }
            
            //Update value to 0
            grid[row][col]='0';
            
            //Call neighbors
            BFS(row+1,col,grid);
            BFS(row-1,col,grid);
            BFS(row,col+1,grid);
            BFS(row,col-1,grid);
            
        }
    
    
}
