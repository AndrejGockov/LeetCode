class Solution {
    public long minimalKSum(int[] nums, int k) {
        long ans = 0;
        HashSet<Integer>hash = new HashSet<>();
        
        Arrays.sort(nums);

        for(int i : nums){
            if(!hash.contains(i) && i <= k){
                k++;
                ans += i;
            }
            hash.add(i);
        }

        ans = (long)(1 + k) * k / 2 - ans;
        return ans;
    }
}