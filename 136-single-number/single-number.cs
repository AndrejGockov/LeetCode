public class Solution {
    public int SingleNumber(int[] nums) {
        int ans = -1;
        for(int i = 0; i < nums.Length; i++){
            int curr = nums[i];
            bool check = true;
            for(int j = 0; j < nums.Length; j++){
                if(curr == nums[j] && i != j){
                    j = nums.Length;
                    check = false;
                }
            }

            if(check)
                return curr;
        }
        return ans;
    }
}