class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0 || nums == null)
            return new ArrayList<>();

        List<String> list = new ArrayList<>();
        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    list.add(Integer.toString(start));
                } else {
                    list.add(start + "->" + nums[i - 1]);
                }

                start = nums[i];
            }
        }

        if (start == nums[nums.length - 1]) {
            list.add(Integer.toString(start));
        } else {
            list.add(start + "->" + nums[nums.length - 1]);
        }

        return list;
    }
}