class Solution {
    
    public int removeElement(int[] nums, int val) {
        
        int count=0;
        int i=0;
        int j=nums.length-1;
        
        //Use two pointers 
        while(i<=j){
            
            if(nums[i]==val){
                //Swap
                //swap(nums[i],nums[j]);
                int temp;
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
                count++;
            }
            if(nums[i]!=val){
                i++;
            }
        }
        
        return nums.length-count;
        
    }
    
}