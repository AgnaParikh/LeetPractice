public class decodeMessage {
    
    public String decodeMessage(String key, String message) {
        
        HashMap<Character,Character> map=new HashMap<>();
        StringBuilder ans=new StringBuilder();
        int counter=0;
        
        for(int i=0;i<key.length();i++){
            
            if(key.charAt(i)==' '){
                continue;
            }
            else if(!map.containsKey(key.charAt(i))){
                
                map.put(key.charAt(i),(char)(counter+'a'));
                counter++;
            }
        }
        
        
        for(int j=0;j<message.length();j++){
            
            if(message.charAt(j)==' '){
                ans.append(' ');
                continue;
            }
            ans.append(map.get(message.charAt(j)));
        }
        
        return ans.toString();
        
    }
}

