class Solution {
    public boolean check(int[] nums) {
        int cnt = 0;

        for(int i = 0;i < nums.length - 1; i++){
            if(nums[i + 1] < nums[i])
                cnt++;
            
            if(cnt > 1)
                return false;
        }

        if(cnt == 0)
            return true;
        
        return nums[0] >= nums[nums.length - 1];
    }
}