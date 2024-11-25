package Arrays.Easy;

class Solution {

    /*
     * Modulo Operation: Since rotating ( n ) times brings the array back to its original state, ( k ) can be reduced to ( k \mod n ).
     * Reverse Technique:
     * Reverse the entire array.
     * Reverse the first ( k ) elements.
     * Reverse the remaining ( n-k ) elements.
     * The final array will be the desired rotated version.
     */


    public void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
}