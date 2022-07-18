public class FirstBadVersion {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
        
    public int firstBadVersion(int n) {
        
        return findBad(0,n);

    }
    
    public int findBad(int start,int end){
            
            int mid=start+(end-start)/2;
            
            if(!isBadVersion(mid)){
                
                return findBad(mid+1,end);
            }
                   
            if(start<end){
                return findBad(start,mid-1);
            }
        
            return mid;            
           
    }
    
    /*public int firstBadVersion(int n) {
        return firstBadVersion(0, n);
    }
    
    private int firstBadVersion(int l, int r) {
        int mid = l + (r - l) / 2; // avoids overflow
        
        if(!isBadVersion(mid))
            return firstBadVersion(mid + 1, r); // move right side
        
        if(l < r) return firstBadVersion(l, mid - 1); // move left until we reach the start of bad version.
        
        return mid; // returns the index of the first occurrence of bad version.
    }*/
}
