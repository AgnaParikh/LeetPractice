class LongestSubstringWithoutRepeating {
    
    //Sliding Window
    //O(n)
    public int lengthOfLongestSubstring(String s) {
        
        ArrayList<Character> track=new ArrayList<>();
        
        if(s.length()<2){
            return s.length();
        }
        
        int i=0,j=1;
        track.add(s.charAt(i));
        int max=track.size();
        
        while(i<j && j<s.length()){
            
            char x=s.charAt(j);
            
            if(track.contains(x)){
                track.remove(0);
                i++;
            }
            
            if(!track.contains(x)){
                track.add(x);
                j++;
            }
            
            if(track.size()>max){
                max=track.size();
            }
            
        }
        
        return max;
        
    }
}
