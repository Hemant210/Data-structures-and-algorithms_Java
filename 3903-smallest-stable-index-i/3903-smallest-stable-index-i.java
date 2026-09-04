class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int max_left = nums[0];

            for (int j = 0; j <= i; j++) {
                max_left = Math.max(max_left, nums[j]);
            }

            int max_right = nums[i];

            for (int j = i; j < n; j++) {
                max_right = Math.min(max_right, nums[j]);
            }

            if (max_left - max_right <= k) {
                return i;
            }
        }
        return -1;
    }
}