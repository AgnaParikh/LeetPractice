public class atoi {

        public int myAtoi(String s) {
            
            if(s.length()<=0){
                return 0;
            }
            
            HashMap<Character,Integer> DigitsMap=new HashMap<>();
            DigitsMap.put('0',0);
            DigitsMap.put('1',1);
            DigitsMap.put('2',2);
            DigitsMap.put('3',3);
            DigitsMap.put('4',4);
            DigitsMap.put('5',5);
            DigitsMap.put('6',6);
            DigitsMap.put('7',7);
            DigitsMap.put('8',8);
            DigitsMap.put('9',9);
            
            boolean isNegative=false;
            int ptr=0;
            long num=0;
            
            //Ignore white spaces
            while(s.charAt(ptr)==' ' && ptr<s.length()){
                ptr++;
                if(ptr>=s.length()){
                    break;
                }
            }
            
            //character is '+' or '-'
            if(ptr<s.length()){
                
                if(s.charAt(ptr)=='-')
                {
                    isNegative=true;
                    ptr++;
                }
                else if(s.charAt(ptr)=='+'){
                    ptr++;
                }
            }
            
            //get character at index ptr
            if(ptr<s.length()){
                
                    while(DigitsMap.containsKey(s.charAt(ptr))){
    
                    num=num*10+DigitsMap.get(s.charAt(ptr));
                    ptr++;
                        
                    if(num>=Integer.MAX_VALUE){
                        break;
                    }
    
                    if(ptr==s.length()){
                        break;
                    }
                        
    
                }
            }
       
            
            //MAIN POINT
            if(isNegative){
                num=num*-1;
                return (int)Math.max(num,Integer.MIN_VALUE);
            }
        
            return (int)Math.min(num,Integer.MAX_VALUE);
                       
        }
    
}
