class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        int ans = 0;
        HashMap<Integer, Integer>hash = new HashMap<>();

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int pr = nums[i] * nums[j];
                ans += 8 * hash.getOrDefault(pr, 0);
                hash.put(pr, hash.getOrDefault(pr, 0) + 1);
            }
        }

        return ans;
    }
}