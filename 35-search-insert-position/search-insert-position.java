class Solution {
    public int binarySearch(int[] nums, int target, int start, int end){
        if(start >= end)
            return start;

        int mid = (int)((start + end) / 2);
        
        if(nums[mid] == target)
            return mid;
        else if(nums[mid] > target)
            return binarySearch(nums, target, start, end - 1);

        return binarySearch(nums, target, start + 1, end);
    }

    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length);
    }
}