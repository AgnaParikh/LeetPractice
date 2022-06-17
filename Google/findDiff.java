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

    //APPROACH 2
    /**
     * public char findTheDifference(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        int [] freqCountOfS=new int[256];
        int [] freqCountOfT=new int[256];
        char result='a';
        for(int i=0;i<n1;i++)
            freqCountOfS[s.charAt(i)]++;
        for(int i=0;i<n2;i++)
            freqCountOfT[t.charAt(i)]++;
        for(int i=0;i<256;i++)
            if(freqCountOfS[i]!=freqCountOfT[i]){
                result=(char)i;
            }
        return result;
    }
    **/
}
    
