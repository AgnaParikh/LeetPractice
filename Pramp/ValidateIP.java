import java.io.*;
import java.util.*;

class ValidateIP {

	static boolean validateIP(String ip) {
		// your code goes here
    
      if(ip.length()<7){
          return false;
      }
    
      String[] ip_split=ip.split("\\.");
      
      System.out.println(ip_split.length);
    
      if(ip_split.length!=4){
        return false;
      }
    
      for(int i=0;i<4;i++){
        
        if(ip_split[i].length()==0){
          return false;
        }
        
        for(char y : ip_split[i].toCharArray()){
          if(!Character.isDigit(y)){
            return false;
          }
        }
        int x=Integer.parseInt(ip_split[i]);
        System.out.print(x+" ");
                               
        if(x<0 || x>255){
          return false;
        }
      }
                               
      return true;
	}

	public static void main(String[] args) {
    
	
	}
}
