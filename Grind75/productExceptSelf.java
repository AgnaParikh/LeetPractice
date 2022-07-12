public class productExceptSelf{

    public int[] productExceptSelf(int[] nums) {
        
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int product=1;
        
        for(int i=0;i<nums.length;i++){
            
            if(i<0){
                left[i]=1;
            }
            else{
                left[i]=product;
            }
            product=product*nums[i];
        }
        
        product=1;
        for(int i=nums.length-1;i>=0;i--){
            
            if(i==nums.length-1){
                right[i]=1*left[i];
            }
            else{
                right[i]=product*left[i];
            }
            product=product*nums[i];
        }
        
        /*for(int i=0;i<nums.length;i++){
            int l=left[i]*right[i];
            left[i]=l;
        }*/
        
        return right;
        
    }
    
}
