public class ValidAnagrams {
        public boolean isAnagram(String s, String t) {
            
            int[] counterS=new int[26];
            int[] counterT=new int[26];
            
            if(s.length()!=t.length()){
                return false;
            }
            
            for(Character x: s.toCharArray()){
                
                counterS[(int)x-'a']++;
                
            }
            
            for(Character x: t.toCharArray()){
                
                counterT[(int)x-'a']++;
                
            }
            
            for(int i=0;i<26;i++){
                
                if(counterS[i]!=counterT[i]){
                    return false;
                }
            }
            
            return true;
        }
    }
}
