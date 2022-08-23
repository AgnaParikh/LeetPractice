public class UniquePaths {
    
        //Recursion Brute Force
        public int uniquePaths(int m,int n){
            
            if(m==1 && n==1) return 1;
            
            if(m==0 && n==0) return 0;
            
            if(m<0 || n<0) return 0;
            
            return uniquePaths(m-1,n) + uniquePaths(m,n-1);
        }
        
        //DP
        /*public int uniquePaths(int m, int n) {
            
            int[] oldRow=new int[n];
            
            //set the bottom most row as 1
            Arrays.fill(oldRow,1);
            
            //Iterate for m rows
            for(int i=0;i<m-1;i++){
                
                //New row
                int[] newRow=new int[n];
                newRow[n-1]=1;
                
                //Skip last column as it is defaulted to 1
                for(int j=n-2;j>=0;j--){
                    
                    //newRow[j]=right+down 
                    //Down is old row[j]
                    newRow[j]=newRow[j+1]+oldRow[j];
                }
                
                oldRow=newRow;
            }
            
            return oldRow[0];
            
        }*/
}
