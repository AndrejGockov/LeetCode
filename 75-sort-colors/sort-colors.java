class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer>map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int i = 0;

        for(Map.Entry<Integer, Integer>entrySet : map.entrySet()){
            for(int j = 0; j < entrySet.getValue(); j++){
                nums[i] = entrySet.getKey();
                i++;
            }
        }
    }
}