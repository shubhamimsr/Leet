class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
	
	for(int i=0; i<nums.length; i++)
	{
		map.put(nums[i], i);
	}
	
	for(int i=0; i<nums.length; i++)
	{
		int result = target - nums[i];
		
		if(map.containsKey(result) && map.get(result) != i) {
			return new int[] {i, map.get(result)};
		}
		// else {
		// 	map.put(nums[i],i);
		// }
	}
	return new int[] {};

    }

    
}