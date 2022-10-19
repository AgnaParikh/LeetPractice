public class RedundantConnections {

        public int[] findRedundantConnection(int[][] edges) {
            
            int[] ans=new int[2];
            
            //Create adjacency list
            
            //Initialize hashmap
            HashMap<Integer,ArrayList<Integer>> adj=new HashMap<>();
            
            //Add edges
            for(int i=0;i<edges.length;i++){
                
                if(!adj.containsKey(edges[i][0])){
                    adj.put(edges[i][0],new ArrayList<Integer>());
                }
                
                if(!adj.containsKey(edges[i][1])){
                    adj.put(edges[i][1],new ArrayList<Integer>());
                }     
            }
            
            //dfs traversal and if the node is already visited set as answer 
            for(int i=0;i<edges.length;i++){
                
                int x=adj.keySet().size();
                
                boolean[] visited=new boolean[x+1];
                
                if(!adj.get(edges[i][0]).isEmpty() && !adj.get(edges[i][1]).isEmpty() && dfs(adj,edges[i][0],edges[i][1],visited)){
                    return edges[i];
                }
                
                adj.get(edges[i][0]).add(edges[i][1]);
                adj.get(edges[i][1]).add(edges[i][0]);
            }
            
            return new int[]{2,2};
            
        }
        
        private boolean dfs(HashMap<Integer,ArrayList<Integer>> adj,int src,int dest,boolean[] visited){
            
            if(src==dest){
                return true;
            }
            
            visited[src]=true;
            List<Integer> edgeList = adj.get(src);
            
            for(Integer x: edgeList){
                if(!visited[x]){
                    if(dfs(adj,x,dest,visited)){
                        return true;
                    }
                
                }
            }
            
            return false;
            
        }
            
        
    }
