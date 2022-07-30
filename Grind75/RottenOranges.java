public class RottenOranges {
    
        //Using breadth first search
        public int orangesRotting(int[][] grid) {
            
            Queue<int[]> que = new LinkedList<>();
    
        int fresh = 0;
        
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                
                if(grid[i][j] == 2){
                    que.add(new int[] {i,j});
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
                
            }
        }
        
        int[][] dirs = {{1,0},{0,1},{0,-1},{-1,0}};
        
        int time = 0;
        
        while(!que.isEmpty() && fresh != 0){
        
            
            int len = que.size();
            
            for(int i = 0;i<len;i++){
                
                int[] cur = que.remove();
                
                for(int[] dir:dirs){
                    int x = cur[0]+dir[0];
                    int y = cur[1]+dir[1];
                    
                    if(x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] != 0 && grid[x][y] != 2){
                                           
                             grid[x][y] = 2;
                             que.add(new int[] {x,y});
                             fresh--;
              
                    }
                   
                }
    
            }
            time++;
            
        }
        if(fresh != 0)return -1;
        return time;
        
        
    }
            
        
     
}
