public class AddStrings {
    
    //Approach: Use ascii values
    //Integer ascii values = "Number"+48
    //eg ascii of 0 -> 0+48
    //OR int jval = j >= 0 ? num2.charAt(j)- '0' : 0;
    public String addStrings(String num1, String num2) {
        
        int carry=0;
        int i=num1.length()-1,j=num2.length()-1;
        int sum=0;
        StringBuilder str=new StringBuilder();
        
        while(i>=0 || j>=0){
            
            if(i<0){
                sum=(int)(num2.charAt(j)-48)+carry;
            }
            else if(j<0){
                sum=(int)(num1.charAt(i)-48)+carry;
            }
            else{
                sum=(int)((num1.charAt(i)-48)+(num2.charAt(j)-48))+carry;
            }
            
            carry=sum/10;
            str.append((char)(sum%10+48));
            i--;j--;
        }
        
        if(carry>0){
            str.append((char)(carry+48));
        }
        
        return str.reverse().toString();
        
    }
}
