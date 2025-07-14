class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length / 3;
        Map<Integer, Integer>map = new HashMap<>();
        List<Integer>ans = new ArrayList<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer>set : map.entrySet()){
            if(set.getValue() > n)
                ans.add(set.getKey());
        }

        return ans;
    }
}