public class Solution {
    public int[] SortedSquares(int[] nums) {
        for(int i = 0; i < nums.Length; i++)
            nums[i] *= nums[i];

        for(int i = 0; i < nums.Length - 1; i++){
            bool swapped = false;
            for(int j = 0; j < nums.Length - i - 1; j++){
                if(nums[j] > nums[j + 1]){
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }
        return nums;
    }
}