    class Solution {
        public int maximumProduct(int[] nums) {
            int n = nums.length-1;
            Arrays.sort(nums);
            return Math.max(nums[0]*nums[1]*nums[n] , nums[n]*nums[n-1]*nums[n-2]);
        }
    }