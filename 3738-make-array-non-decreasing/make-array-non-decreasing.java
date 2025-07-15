class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer>ans = new Stack<>();

        for(int i = 0; i < nums.length; i++){
            if(ans.isEmpty() || ans.peek() <= nums[i]){
                ans.push(nums[i]);
            }
        }

        return ans.size();
    }
}