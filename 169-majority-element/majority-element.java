class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length / 2;
        Map<Integer, Integer>map = new HashMap<>();
        int maxCount = 0;
        int ans = 0;

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer>set : map.entrySet()){
            if(set.getValue() > n && set.getValue() > maxCount){
                ans = set.getKey();
                maxCount = set.getValue();
            }
        }

        return ans;
    }
}