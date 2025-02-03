class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>ans = new ArrayList<>();
        HashSet<Integer>hash = new HashSet<>();

        for(int i : nums){
            if(hash.contains(i) && !ans.contains(i))
                ans.add(i);
            else
                hash.add(i);
        }

        return ans;
    }
}