public class TwoSumII {
        public int[] twoSum(int[] numbers, int target) {
            
            int i=0, j=numbers.length-1;
            int a=0,b=0;
            
            while(i<j){
                if(numbers[i]+numbers[j]<target){
                    i++;
                }
                
                else if(numbers[i]+numbers[j]>target){
                    j--;
                }
                
                else {
                    a=i+1; b=j+1;
                    break;
                }
            }
            int[] ans=new int[2];
            ans[0]=a; ans[1]=b;
            return ans;
            
        }
    
}
