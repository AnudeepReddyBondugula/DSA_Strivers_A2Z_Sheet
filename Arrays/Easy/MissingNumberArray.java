package Arrays.Easy;
/*
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 */
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < nums.length; i++){
            sum += i+1;
            sum2 += nums[i];
        }

        return sum - sum2;
    }
}
