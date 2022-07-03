public class LetterCombinationOfNumbers {
    
        ArrayList<String> ans;
        
        //Get codes string
        private String getCharacterForDigit(int digit){
            String[] codes=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            
            return codes[digit];
            
        }
        
        public List<String> letterCombinations(String digits) {
            
            if(digits.length()==0){
                return new ArrayList<String>();
            }
            
            ans=new ArrayList<String>();
            
            letterCombinations(digits,new StringBuilder(),0);
            
            return ans;
        }
        
        private void letterCombinations(String digit,StringBuilder res,int index){
            
            //Base Case
            if(index==digit.length()){
                ans.add(res.toString());
                return;
            }
            
            String currCode=getCharacterForDigit(digit.charAt(index)-'0');
            
            for(int i=0;i<currCode.length();i++){
                StringBuilder temp=new StringBuilder(res);
                letterCombinations(digit,temp.append(currCode.charAt(i)),index+1);
            }
        }
    }    
}
