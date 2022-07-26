public class SearchRotatedArray {

        public int search(int[] nums, int target) {
            
            if(nums.length==0 || nums==null){
                return -1;
            }
            
            //Get pivot point or min element
            int left=0,right=nums.length-1;
            
            while(left<right){
                
                int mid=left + (right-left)/2;
                
                if(nums[mid]>nums[right]){
                    left=mid+1;
                }
                else{
                    right=mid;
                }
            }
            
            //Min element is stored in left index
            int start=left;
            left=0;right=nums.length-1;
            
            //If target is in right half
            if(target>=nums[start] && target<=nums[right]){
                left=start;
            }
            else{
                right=start;
            }
            
            //Search in respective sorted half
            while(left<=right){
                int mid=left + (right-left)/2;
                
                if(nums[mid]==target){
                    return mid;
                }
                
                else if(nums[mid]<target){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            
            return -1;
            
    
            
        }
        
        /*private static int binarySearch(int[] nums,int start,int end,int target){
            
            int mid=start+(end-start)/2;
            
            System.out.println(start+" "+end);
            if(start>end){
                
                return -1;
            }
              
             if(nums[mid]==target){
                 System.out.println(mid);
                 return mid;
             }
               
              else if(nums[mid]<target){
                  return binarySearch(nums,start,mid-1,target);
              }
               
               return binarySearch(nums,mid+1,end,target);
        }*/
}
    
