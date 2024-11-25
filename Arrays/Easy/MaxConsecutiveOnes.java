package Arrays.Easy;

class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int local = 0;
        for(int x : nums){
            if (x == 1) local++;
            max = Math.max(max, local);
            if (x == 0) {
                local = 0;
            }
        }

        return max;
    }
}
