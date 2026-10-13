class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();

        long sum = 0, maxsum = 0;
        
        int left = 0;

        for(int i = 0; i < n; i++){
             while(set.contains(nums[i])){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
             }

             set.add(nums[i]);
             sum += nums[i];

             if(i - left + 1 == k){
                maxsum = Math.max(maxsum, sum);

                set.remove(nums[left]);
                sum -= nums[left];
                left++;
             }
        }

        return maxsum;
    }
}