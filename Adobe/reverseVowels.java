class reverseVowels {
    public String reverseVowels(String s) {
        
        if(s.length()==0){
            return s;
        }
        
        StringBuilder newS=new StringBuilder(s);
        
        System.out.println(newS);
        int i=0,j=s.length()-1;
        
        while(i<=j){
            
            //check vowel
            if(isVowel(newS.charAt(i)) && isVowel(newS.charAt(j))){
                //Swap
                char temp=newS.charAt(i);
                newS.setCharAt(i,newS.charAt(j));
                newS.setCharAt(j,temp);
                i++;
                j--;
                
            }
            
            else{
                if(isVowel(newS.charAt(i))){
                    j--;
                }
                else if(isVowel(newS.charAt(j))){
                    i++;
                }
                else{
                    i++;
                    j--;
                }
               
            }
        
        }
        
        return newS.toString();
        
    }
    
    /**private boolean isVowel(char x){
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' || x=='O' || x=='U'){
            return true;
        }
        return false;
    }**/
    
    private boolean isVowel(char ch) {
        switch(ch) { 
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
        return true;
        default : return false;
        }
    }
}