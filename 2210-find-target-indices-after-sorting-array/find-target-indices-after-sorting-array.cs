public class Solution {
    public IList<int> TargetIndices(int[] nums, int target) {
        IList<int> ans  = new List<int>();
        Array.Sort(nums);
        for(int i = 0; i < nums.Length; i++){
            if(nums[i] == target){
                ans.Add(i);
            }
        }
        return ans;
    }
}