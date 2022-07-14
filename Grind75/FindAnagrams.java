public class FindAnagrams { 
        //
        public List<Integer> findAnagrams(String s, String p) {
            
            int[] counter=new int[26];
            int i=0,j=0;
            int[] counterP=new int[26];
            
            List<Integer> ans=new ArrayList<>();
            
            for(int k=0;k<p.length();k++){
                counterP[(int)p.charAt(k)-'a']++;
                //System.out.println((int)s.charAt(k)-'a'+" "+k);
            }
            
            //Set window
            while(j<p.length() && j<s.length())
            {
                
                counter[(int)s.charAt(j)-'a']++;
                j++;
            } 
    
            if(checkAnagram(counter,counterP)){
                ans.add(i);
            }
            
            //slide window
            while(i<j && j<s.length()){
                
                //Increment j and add
                //j++;
                counter[(int)s.charAt(j)-'a']++;
                j++;
                
                //Increment i and remove
                counter[(int)s.charAt(i)-'a']--;
                i++;
                
                //Check Anagram
                if(checkAnagram(counter,counterP)){
                    ans.add(i);
                }
                
            }
            
            return ans;
        }
        
        private boolean checkAnagram(int[] s,int[] p){
            
            for(int i=0;i<26;i++){
                if(p[i]!=s[i]){
                    return false;
                }
            }
            
            return true;
        }
    }
    
