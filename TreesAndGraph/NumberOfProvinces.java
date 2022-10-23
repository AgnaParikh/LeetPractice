class Solution {
    
    boolean[] isVisited;
    
    public int findCircleNum(int[][] isConnected) {
        
        isVisited=new boolean[isConnected.length];
        int provinces=0;
        
        for(int i=0;i<isConnected.length;i++){
            
            if(isVisited[i]==false){
                dfs(isConnected,isVisited,i);
                provinces++;
            }
        }
        
        return provinces;
    }
    
    private void dfs(int[][] isConnected,boolean[] isVisited,int src)
    {
        if(isVisited[src]==true){
            return;
        }
        
        isVisited[src]=true;
        
        for(int i=0;i<isConnected[src].length;i++){
            
            if(isVisited[i]==false && isConnected[src][i]==1){
                 dfs(isConnected,isVisited,i);
            }
        }
        
    }
}