class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int ans = 0;

        while(k > 0){
            int smallest = nums[0];
            int indx = 0;
            for(int j = 0; j < nums.length; j++){
                if(smallest > nums[j]){
                    smallest = nums[j];
                    indx = j;
                }
            }
            nums[indx] *= (-1);
            k--;
        }

        for(int i = 0; i < nums.length; i++)
            ans += nums[i];

        return ans;
    }
}