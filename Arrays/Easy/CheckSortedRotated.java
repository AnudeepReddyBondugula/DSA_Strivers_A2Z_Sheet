package Arrays.Easy;

class Solution {
    public boolean check(int[] nums) {
        boolean flag = false;
        int n = nums.length;
        int idx = -1;
        for(int i = 0; i < n-1; i++){
            if (nums[i] > nums[i+1]){
                flag = true;
                idx = i+1;
                break;
            }
        }
        if (!flag) return true;
        for(int i = 0; i < n-1; i++){
            int x = (idx+i)%n;
            int y = (idx+i+1)%n;
            if (nums[x] > nums[y]) return false;
        }
        return true;
    }
}