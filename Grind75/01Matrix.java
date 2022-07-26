public class 01Matrix {

        public int[][] updateMatrix(int[][] mat) {
                    
            int m=mat.length;
            int n=mat[0].length;
            int[][] result=new int[m][n];
            
            //pair class
            class Pair{
                
                int row;
                int col;
                public Pair(int r,int c){
                    row=r;
                    col=c;
                }
                
                @Override
                public String toString(){
                    return "("+row+","+col+")";
                }
            }
            
            //Create queue for bfs
            Queue<Pair> q = new LinkedList<>();
            
            //Create result
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                
                    if(mat[i][j]==0){
                        result[i][j]=0;
                        q.offer(new Pair(i,j));
                    }
                    else{
                        result[i][j]=Integer.MAX_VALUE;
                    }
                }
            }
            
            //Create direction array
            int[][] dir=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
            
            //BFS
            while(!q.isEmpty()){
                
                Pair curr=q.remove();
                //System.out.println(curr.row +" "+curr.col+" "+q.toString());
                
                
                for(int i=0;i<4;i++){
                    
                    int newRow=curr.row+dir[i][0];
                    int newCol = curr.col + dir[i][1];
                    
                    if(newRow>=0 && newRow<m && newCol>=0 && newCol<n){
                        
                        if(result[newRow][newCol]!=0){
                            
                            if(result[newRow][newCol]>result[curr.row][curr.col]+1){
                                    result[newRow][newCol]=result[curr.row][curr.col]+1;
                                    q.add(new Pair(newRow,newCol));
                            }                      
    
                        }
                    }
                    
                }
                
            }
            
            return result;
        }
    
}
