public class Solution {
    public IList<IList<int>> FourSum(int[] nums, int target) {
        IList<IList<int>>ans = new List<IList<int>>();

        if(nums == null || nums.Length < 4)
            return ans;

        Array.Sort(nums);
        int n = nums.Length;

        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i - 1])
                continue;

            for(int j = i + 1; j < n; j++){
                if(j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                
                int start = j + 1;
                int end = n - 1;

                while(start < end){
                    long sum = (long)nums[i] + nums[j] + nums[start] + nums[end];

                    if(sum < target){
                        start++;
                    }else if(sum > target){
                        end--;
                    }else {
                        List<int>list = new List<int>{nums[i], nums[j], nums[start], nums[end]};
                        ans.Add(list);
                        start++;
                        end--;
                        
                        while(start < end && nums[start] == nums[start - 1])
                            start++;
                    }
                }
            }
        }

        return ans;
    }
}