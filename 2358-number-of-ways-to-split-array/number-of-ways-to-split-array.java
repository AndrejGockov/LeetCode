class Solution {
    public int waysToSplitArray(int[] nums) {
        int ans = 0;
        long prefix = 0;
        long suffix = 0;

        for(int i = 0; i < nums.length; i++)
            suffix += nums[i];
        
        for(int i = 0; i < nums.length - 1; i++){
            prefix += nums[i];
            if(prefix >= suffix-prefix)
                ans++;
        }
        
        return ans;
    }
}
