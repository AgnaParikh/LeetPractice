public class SingleNumber {

    //Approach: Use XOR bit manipulation
    // Time complexity O(n)
    // Space Complexity O(1)

    public int singleNumber(int[] nums) {
        
        int result=0;
        
        for(int num: nums){
            result=result^num;
        }
        
        return result;
        
    }
}
