class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int result = 0;


        for(int i = 0; i < n; i++){
            if(val != nums[i]){
            nums[result] = nums[i];
            result++;
            }
        }

        return result;
    }
}