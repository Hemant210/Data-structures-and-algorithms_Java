class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        // int maxvalue = Integer.MIN_VALUE;

        // for(int i = 0; i < n; i++){
        //     int c = 0;
        //     for(int j = i; j < n; j++){
        //         c += nums[j];
        //         maxvalue = Math.max(maxvalue, c);
        //     }
        // }
        // return maxvalue;

        int currsum = nums[0];
        int maxsum = nums[0];

        for(int i = 1; i < n; i++){
            currsum = Math.max(currsum + nums[i], nums[i]);

            maxsum = Math.max(maxsum, currsum);
        }

        return maxsum;
    }
}