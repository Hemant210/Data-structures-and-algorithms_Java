class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, s = 0, m = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            s += nums[i];

            while(s >= target){
                m = Math.min(m, i - l + 1);
                s -= nums[l++];
            }
        }

        return (m == Integer.MAX_VALUE) ? 0 : m;
    }
}