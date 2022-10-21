class Solution {
    public int numberOfBoomerangs(int[][] points) {
        
        //Brute force O(n^2)
        
        int ans=0;
        
        for(int i = 0;i<points.length;i++){
            
            //HashMap with key as distance and value as count of that distance
            HashMap<Integer,Integer> dist=new HashMap<>();
            
            for(int j=0;j<points.length;j++){
                
                int distance=distance(points[i][0],points[i][1],points[j][0],points[j][1]) ;              
                dist.put(distance,dist.getOrDefault(distance,0)+1);
            }
            
            for(int x: dist.values()){
                //Permutation (nC2 * 2!)
                ans+=(x)*(x-1);
            }
            
        }
        
        return ans;
        
        
        
    }
    
    private int distance(int x1,int y1,int x2,int y2){
        
        return (x2 - x1)*(x2-x1) + (y2-y1)*(y2-y1);
        
    }
}
