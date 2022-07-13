public class MergeIntervals {
    
        public int[][] merge(int[][] intervals) {
            
            Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
            int[] current=intervals[0];
            ArrayList<int[]> result=new ArrayList<>();
            
            for(int i=1;i<intervals.length;i++){
                
                boolean overlapping=overlapping(current,intervals[i]);
                if(overlapping){
                    current[0]=Math.min(intervals[i][0],current[0]);
                    current[1]=Math.max(intervals[i][1],current[1]);
                }
                else{
                    result.add(current);
                    current=intervals[i];
                }
            }
            
            result.add(current);
            
            int[][] ans=new int[result.size()][2];
            int i=0;
            for(int[] res: result){
                ans[i]=res;
                i++;
            }
            
            return ans;
        }
}
