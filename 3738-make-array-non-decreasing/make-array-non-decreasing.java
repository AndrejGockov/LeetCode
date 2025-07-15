class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer>ans = new Stack<>();
        ans.push(nums[0]);

        for(int i = 1; i < nums.length; i++){
            if(ans.peek() <= nums[i]){
                ans.push(nums[i]);
            }
        }

        return ans.size();
    }
}