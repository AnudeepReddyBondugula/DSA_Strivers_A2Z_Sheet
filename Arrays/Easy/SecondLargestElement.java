package Arrays.Easy;

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max1 = Integer.MIN_VALUE;
        int max2 = -1;
        for(int i = 0; i < arr.length; i++){
            if (max1 < arr[i]) max1 = arr[i];
        }
        
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max2 && arr[i] < max1) max2 = arr[i];
        }
        
        return max2;
    }
}