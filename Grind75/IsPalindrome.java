public class IsPalindrome {
    
        public boolean isPalindrome(String s) {
            
            if(s.length()<=0){
                return false;
            }
            
           s=s.toLowerCase();
           int left=0,right=s.length()-1;
            
           while(left<right && left<s.length()){
               
               while(!(s.charAt(left)>='a' && s.charAt(left)<='z' || Character.isDigit(s.charAt(left)))){
                   
                   left++;
                    if(left>right || left>s.length()-1){
                       break;
                   }
               }
               
               while(!(s.charAt(right)>='a' && s.charAt(right)<='z' || Character.isDigit(s.charAt(right)))){
                   
                   right--;
                   if(right<=0){
                       break;
                   }
               }
               
               if(left<right){
                   if(s.charAt(left)==s.charAt(right)){
                       left++;
                       right--;
                   }
            
                   else{
                       return false;
                   }
               }
    
           }
            
            return true;
            
        }
}
