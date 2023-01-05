public class IsSubsequence {
        public boolean isSubsequence(String s, String t) {
    
            int i=0, j=0;
    
            while(j<s.length() && i<t.length()){
    
                if(s.charAt(j) == t.charAt(i)){
                    System.out.println(s.charAt(j));
                    j++;
                }
                i++;
            }
    
            if(j==s.length()){
                return true;
            }
    
            return false;
            
    }
}
