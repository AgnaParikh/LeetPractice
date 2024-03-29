/**
APPROACH : Definition for overlapping interval : Two intervals are said to be overlapping when the current interval's start is less than the previous interval's end . Then this interval is said to be overlapping 
            So inorder to find the overlapping intervals , first we need to sort the intervals  in ascending order based on the end index . so that we will have a time table kind of array , if there are no overlapping intervals then the sorting would return something like [1,2][2,3][3,4][4,5] ->the array is sorted based on end index . as u can see there arfe no overlapping intervals 
            Our task is to sort it and then iterate the array based on the condition like if intervals[current][0] < intervals[prev][i] then its overlapping 
            If non overlapping condition doesnt satidy then update the prevIndex and this problem is similar to Interval Scheduling problem 
**/
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int removed = 0;
        //Step 1 : Sort the array based on end index of intervals
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[1],b[1]));
        //Step 2 : assign the prevIndex as intervals[0][1] initially follow step 3 for further iteration
        int prevClose = intervals[0][1];
        //Step 3 : Now start iterating 
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] < prevClose){
                removed++;
            }
            else{
            //Each iteration update the prevIndex 
            prevClose = intervals[i][1];
            }
        }
        return removed;
    }
}
