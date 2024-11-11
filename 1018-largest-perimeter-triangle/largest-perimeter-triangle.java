class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        int ans = 0;

        if(a + b > c)
            ans = a + b + c;

        for(int i = 2; i < nums.length; i++){
            a = nums[i - 2];
            b = nums[i - 1];
            c = nums[i];
            
            if(a + b > c){
                ans = a + b + c;
            }
        }

        return ans;
    }
}