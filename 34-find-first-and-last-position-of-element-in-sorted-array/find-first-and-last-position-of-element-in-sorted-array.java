class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        if(nums.length == 0)
            return ans;
        
        int i = 0, j = nums.length - 1;
        
        while(i <= j){
            if(nums[i] == target){
                ans[0] = i;
                break;
            }
            i++;
        }

        if(i == j){
            ans[1] = ans[0];
            return ans;
        }

        while(j >= i){
            if(nums[j] == target){
                ans[1] = j;
                break;
            }
            j--;
        }
        
        return ans;
    }
}