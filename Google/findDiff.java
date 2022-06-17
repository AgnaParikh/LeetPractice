public class findDiff {
    
    //Approach Sum up unicode values
    //O(N)
    public char findTheDifference(String s, String t) {
        
        int sumS=0,sumT=0;
        
        for(int i=0;i<s.length();i++){
            sumS+=(int)s.charAt(i);
        }
        
        for(int i=0;i<t.length();i++){
            sumT+=(int)t.charAt(i);
        }
        
        return (char)(sumT-sumS);
        
    }
}
    
