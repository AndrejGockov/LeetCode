class Solution {
    public int singleNumber(int[] nums) {
        int ans = -1;
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            boolean check = true;
            for(int j = 0; j < nums.length; j++){
                if(curr == nums[j] && i != j){
                    j = nums.length;
                    check = false;
                }
            }

            if(check)
                return curr;
        }
        return ans;
    }
}