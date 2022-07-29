public class WordSearch {
    
        boolean[][] visited;
        
        public boolean exist(char[][] board, String word) {
            
            if(board==null){
                return false;
            }
            
            visited=new boolean[board.length][board[0].length];
            
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    
                    if(board[i][j]==word.charAt(0)){
                        if(Backtrack(board,0,word,i,j)){
                            return true;
                        }
                    }
                    
                }
            }
            
            return false;
            
        }
        
        private boolean Backtrack(char[][] board,int level,String word,int row,int col){
            
            if(level==word.length()){            
                return true;
            }
            
            if(row<0 || row>=board.length || col<0 || col>=board[0].length || visited[row][col]==true){
                //System.out.println(row+" "+col+" "+board[row][col]);
                return false;
            }
            
            //System.out.println(row+" "+col+" "+board[row][col]);
            
    
            
            if(word.charAt(level)!=board[row][col]){
                //System.out.println(row+" "+col+" "+board[row][col]);
                return false;
            }
            
            //To avoid self recursion
            visited[row][col]=true;
            
            
            if(Backtrack(board,level+1,word,row-1,col) || 
                Backtrack(board,level+1,word,row+1,col) || 
                Backtrack(board,level+1,word,row,col-1) ||
                Backtrack(board,level+1,word,row,col+1)){
                
                return true;
            }
            
            visited[row][col]=false;
            
            return false;
        }
    }
