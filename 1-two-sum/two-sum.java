import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store: Key = number value, Value = index of that number
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement exists in the map, we found our pair!
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, store the current number and its index in the map
            map.put(nums[i], i);
        }
        
        // Return empty array if no solution is found (though the problem guarantees one)
        return new int[] {};
    }
}