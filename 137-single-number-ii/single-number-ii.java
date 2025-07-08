class Solution {
    public int singleNumber(int[] nums) {
        int ans = -1;
        Map<Integer, Integer>hash = new HashMap<>();

        for(int i : nums){
            hash.put(i, hash.getOrDefault(i, 0) + 1);
        }

        for(int i : nums){
            if(hash.get(i) == 1){
                ans = i;
                break;
            }
        }

        return ans;
    }
}