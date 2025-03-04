class NumArray {
    int[] nums;
    public NumArray(int[] nums) {
        this.nums = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            this.nums[i] = nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int ans = 0;
        for(int i = left; i <= right; i++){
            ans += nums[i];
        }
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */