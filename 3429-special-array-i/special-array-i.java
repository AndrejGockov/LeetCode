class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return true;
        
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                if((nums[0] % 2) == (nums[1] % 2))
                    return false;
                continue;
            }
            
            if(i == nums.length - 1){
                if((nums[nums.length - 1] % 2) == (nums[nums.length - 2] % 2))
                    return false;
                continue;
            }
            
            if((nums[i - 1] % 2) == (nums[i] % 2)
            || (nums[i] % 2) == (nums[i + 1] % 2)){
                return false;
            }
        }
        return true;
    }
}