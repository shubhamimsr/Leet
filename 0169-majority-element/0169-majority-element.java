class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int num=0;
        Set<Integer> set = map.keySet();
        for(Integer key:set){
            if(map.get(key) > nums.length/2){
                num = key; 
            }
        }
        return num;
    }
}