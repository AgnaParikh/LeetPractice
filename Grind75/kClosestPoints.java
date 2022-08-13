public class kClosestPoints {

    class Solution {
    
        public int[][] kClosest(int[][] points, int k) {
            
            if(k==points.length){
                return points;
            }
        
            int[][] ans=new int[k][2];
            
            //Max heap with custom comparator
            PriorityQueue<DistancePoint> max_heap=new PriorityQueue<>((a,b) -> (b.distance-a.distance));
            
            for(int i=0;i<points.length;i++){
                max_heap.add(new DistancePoint(distance(points[i][0],points[i][1]),points[i][0],points[i][1]));
            }
            
            
            for(int i=0;i<points.length-k;i++){
                max_heap.poll();
            }
            
            for(int i=0;i<k;i++){
                DistancePoint a=max_heap.poll();
                ans[i][0]=a.x; ans[i][1]=a.y;
            }
            
            
            
            return ans;
            
        }
        
        //Min heap using priority queue
        /*public int[][] kClosest(int[][] points, int k) {
            
            if(k==points.length){
                return points;
            }
        
            int[][] ans=new int[k][2];
            
            //Min heap with custom comparator
            PriorityQueue<DistancePoint> max_heap=new PriorityQueue<>((a,b) -> (a.distance-b.distance));
            
            for(int i=0;i<points.length;i++){
                max_heap.add(new DistancePoint(distance(points[i][0],points[i][1]),points[i][0],points[i][1]));
            }
            
            
            for(int i=0;i<k;i++){
                DistancePoint a=max_heap.poll();
                ans[i][0]=a.x; ans[i][1]=a.y;
            }
            
            return ans;
            
        }*/
        
        private int distance(int x,int y){
            return (x*x+y*y);
        }
        
    
    }
    
    public class DistancePoint{
            
            public int x;
            public int y;
            public int distance;
            
            public DistancePoint(int distance,int x,int y){
                this.x=x;
                this.y=y;
                this.distance=distance;
            }
        
            @Override
            public String toString(){
                return "["+this.x+","+this.y+"]"+this.distance;
            }
    }
    
}
