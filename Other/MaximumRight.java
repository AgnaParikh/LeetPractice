class Solution {
    public int[] replaceElements(int[] arr) {

        int maxRight=arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--){
            int prev=arr[i];
            arr[i]=maxRight;
            if(maxRight < prev){
                maxRight=prev;
            }
        }

        arr[arr.length-1]=-1;
        return arr;
    }
}