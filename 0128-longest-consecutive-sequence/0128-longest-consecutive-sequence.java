class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], true);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] - 1)) {
                map.put(nums[i], false);
            }
        }

        int msp = 0, ml = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == true) {
                map.put(nums[i], false); // <-- ADD THIS LINE to prevent recounting duplicates
                int tl = 1, tsp = nums[i];
                while (map.containsKey(tsp + tl)) {
                    tl++;
                }
                if (tl > ml) { // Changed 'while' to 'if' for clarity
                    msp = tsp;
                    ml = tl;
                }
            }
        }
        return ml;
    }
}