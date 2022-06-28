class NumArray {

    public int[] nums;
    public NumArray(int[] nums) {
        

        this.nums=new int[nums.length];
        for(int i=0;i<nums.length;i++){
                this.nums[i]=nums[i];     
        }
        
    }
    
    public int sumRange(int left, int right) {
        
        int sum=0;
        
        for(int i=left;i<right+1;i++){
            sum=sum+this.nums[i];
        }
        
        return sum;
        
    }
}
