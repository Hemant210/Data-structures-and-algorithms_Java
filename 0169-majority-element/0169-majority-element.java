class Solution {
    public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i=0; i < nums.length; i++){
//             if(map.containsKey(nums[i])){
//                 map.put(nums[i], map.get(nums[i]) + 1);
//             } else {
//                 map.put(nums[i], 1);
//             }
//         }

//         for(int key : map.keySet()){
//             if(map.get(key) > nums.length/2){
//                 return key;
//             }
//         }

//         return -1;
//     }
// }
        

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return nums[i];
            }
        }

        return -1; // For safety; in Leetcode, a majority element is guaranteed to exist
    }
}