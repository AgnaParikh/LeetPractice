class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] ransomCharCount=new int[26];
        int[] magazineCharCount=new int[26];
        
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        
        for(int i=0;i<26;i++){
            ransomCharCount[i]=0; magazineCharCount[i]=0;
        }
        
        for(int i=0;i<ransomNote.length();i++){
            ransomCharCount[(int)(ransomNote.charAt(i)-'a')]++;
        }
        
        for(int i=0;i<magazine.length();i++){
            magazineCharCount[(int)(magazine.charAt(i)-'a')]++;
        }
        
        for(int i=0;i<ransomNote.length();i++){
            int index=(int)(ransomNote.charAt(i)-'a');
            
            if(ransomCharCount[index]>magazineCharCount[index]){
                return false;
            }
        }
        
        return true;
        
        
    }
}
