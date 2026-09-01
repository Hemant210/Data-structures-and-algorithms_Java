class Solution {
    public int searchInsert(int[] nums, int target) {
        // int start = 0;
        // int end = nums.length - 1;

        // while(start <= end){
        //     int mid = start + (end - start)/2;

        //     if(nums[mid] == target) return mid;
        //     else if(nums[mid] > target) end = mid - 1;
        //     else start = mid + 1;
        // }

        int j = nums.length;

        for(int i = 0; i < j; i++){
            if(nums[i] == target){
                return i;
            } 
            if(nums[i] > target){
                return i;
            }
        }
        return j;
    }
}