class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>ans = new ArrayList<>();
        HashSet<Integer>hash = new HashSet<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(!hash.contains(nums[i]))
                hash.add(nums[i]);
        }

        for(int i = 1; i <= n; i++){
            if(!hash.contains(i))
                ans.add(i);
        }

        return ans;
    }
}