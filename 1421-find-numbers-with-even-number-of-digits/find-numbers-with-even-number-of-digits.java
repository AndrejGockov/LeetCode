class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        int n = nums.length;

        for(int i : nums){
            String number = Integer.toString(i);

            if(number.length() % 2 == 0)
                ans++;
        }

        return ans;
    }
}