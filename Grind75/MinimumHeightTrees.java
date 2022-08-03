public class MinimumHeightTrees {
    
        //Using BFS
        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            
            //Edge cases
            if(n<2){
                ArrayList<Integer> centroids=new ArrayList<>();
                for(int i=0;i<n;i++){
                    centroids.add(i);
                }
                return centroids;
            }
            
            //Build an adjacency list representation of graph
            ArrayList<Set<Integer>> neighbors=new ArrayList<>();
            
            //Initialize
            for(int i=0;i<n;i++){
                neighbors.add(new HashSet<Integer>());
            }
            
            //Add edges
            for(int[] edge:edges){
                Integer start=edge[0],end=edge[1];
                //Since undirected add on both the sides
                neighbors.get(start).add(end);
                neighbors.get(end).add(start);
            }
            
            //Add first layer of leaves, that is, nodes with degress 1
            //Size of list of neighbors is 1
            ArrayList<Integer> leaves=new ArrayList<>();
            
            for(int i=0;i<n;i++){
                //check if degree = 1
                if(neighbors.get(i).size()==1){
                    leaves.add(i);
                }
            }
            
            //Trim the leaves until reaching the centroids or remaining nodes =2 
            int remainingNodes=n;
            while(remainingNodes>2){
                
                remainingNodes-=leaves.size();
                ArrayList<Integer> newLeaves=new ArrayList<>();
                
                //Remove current leaves along with the edges
                for(Integer leaf : leaves){
                    
                    //THe only neighbor left for the leaf node
                    Integer neighbor = neighbors.get(leaf).iterator().next();
                    
                    //Remove the edge along with the leaf node
                    neighbors.get(neighbor).remove(leaf);
                    
                    //If neighbor became a leaf node add to list
                    if(neighbors.get(neighbor).size()==1){
                        newLeaves.add(neighbor);
                    }
                }
                    
                //Next round of leaves
                leaves=newLeaves;
                
            }
            
            //Remaining are centroids
            return leaves;
        }
    }
    
}
