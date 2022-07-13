public class InsertIntervals {
    
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> result=new ArrayList<>();
        boolean flag=false;
        
        for(int i=0;i<intervals.length;i++){
            
            //if end of newInterval < start of interval
            //Does not overlap
            if(newInterval[1]<intervals[i][0]){
                result.add(newInterval);
                for(int j=i;j<intervals.length;j++){
                    result.add(intervals[j]);
                }
                flag=true;
                break;
            }
            //Non overlapping case 2
            else if(newInterval[0]> intervals[i][1]){
                result.add(intervals[i]);
            }
            else{
                newInterval[0]=(Math.min(newInterval[0],intervals[i][0]));
                newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            }
        }
        if(flag==false){
             result.add(newInterval);
        }
              
        int[][] ans=new int[result.size()][2];
        int i=0;
        for(int[] res: result){
            ans[i]=res;
            i++;
        }
        
        return ans;
    }
}
