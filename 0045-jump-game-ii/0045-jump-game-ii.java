class Solution {
    public int jump(int[] nums) {
        int jump = 0, currend = 0, currhest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            currhest = Math.max(currhest, nums[i] + i);

            if (i == currend) {
                currend = currhest;
                jump++;
            }
        }

        return jump;
    }
}