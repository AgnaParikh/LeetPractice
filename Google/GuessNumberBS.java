/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class GuessNumberBS extends GuessGame {
    
    int guess;
    
   /**public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            if (res == 0)
                return mid;
            else if (res < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }**/
    // 14/25
    // O(logn)
    // Binary Search
    public int guessNumber(int n) {
        
        guessNumber(1,n);
        
        return guess;
    }
    
    private void guessNumber(int start,int end){
        
        int mid = start + (end - start) / 2;
        int ans=guess(mid);
        
        if(ans==0){
            guess=mid;
        }
        
        if(ans==1){
            guessNumber(mid+1,end);
        }
        else if(ans==-1){
            guessNumber(start,mid-1);
        }
        
    }
}