public class MostWater {

        //Two pointers 
        //O(n)
        public int maxArea(int[] height){
            
            int maxArea=0;
            int left=0,right=height.length-1;
            
            while(left<right){
                
                    if((Math.min(height[left],height[right])*(right-left))>maxArea){
                        System.out.println(left+" "+right);
                        maxArea=Math.min(height[left],height[right])*(right-left);
                    }
                
                    if(height[left]<height[right]){
                        left++;
                    }
                    else{
                        right--;
                    }
            }
            
            return maxArea;
            
        }
        
        //Brute Force 
        // O(n^2)
        /*public int maxArea(int[] height) {
            
            int maxArea=0;
            
            for(int i=0;i<height.length;i++){
                
                for(int j=i+1;j<height.length;j++){
                    
                    if((Math.min(height[i],height[j])*(j-i))>maxArea){
                        maxArea=Math.min(height[i],height[j])*(j-i);
                    }
                }
            }
            
            return maxArea;
            
        }*/
    }
    
}
