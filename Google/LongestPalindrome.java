public class LongestPalindrome {
    
    //Time complexity: O(n)
    //Space complexity: O(n)
    //Approach 1: Use hashSet, add element if not present and remove if present
    public int longestPalindrome(String s) {
        
        HashSet<Character> characterInString=new HashSet<>();
        int longestPalin=0;
        
        for(int i=0;i<s.length();i++){
            
            //HashSet contains that character, remove it
            char currChar=s.charAt(i);
            if(characterInString.contains(currChar)){
                characterInString.remove(currChar);
                System.out.println(longestPalin);
                longestPalin=longestPalin+2;
            }
            else{
                characterInString.add(currChar);
            }
        }
        
        if(!characterInString.isEmpty()){
            return longestPalin+1;
        }
        
        return longestPalin;
        
    }
    
    //APPROACH 2: Use a character 128 size
    //Time complexity: O(n)
    //Space complexity: O(1) contant space
    /*public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }*/
}
