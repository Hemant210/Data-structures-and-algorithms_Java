class Solution {
    public void helper(int[] nums, int target, int index, int n, List<Integer> current, Set<List<Integer>> set) {
        if (index == n) {
            if (target == 0) {
                set.add(new ArrayList<>(current));
            }
            return;
        }

        helper(nums, target, index + 1, n, current, set);

        if (nums[index] <= target) {
            current.add(nums[index]);
            helper(nums, target - nums[index], index, n, current, set);
            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> templist = new ArrayList<>();
        helper(candidates, target, 0, candidates.length, templist, set);

        return new ArrayList<>(set);

    }
}