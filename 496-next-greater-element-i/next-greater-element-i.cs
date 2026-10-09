public class Solution {
    public int[] NextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.Length;
        int m = nums2.Length;
        int[] ans = new int[n];
        int indx = 0;
        Dictionary<int, int>lookups = new Dictionary<int, int>();

        for(int i = 0; i < m; i++){
            lookups.Add(nums2[i], i);
        }

        for(int i = 0; i < n; i++){
            lookups.TryGetValue(nums1[i], out int index);
            int nextGreater = -1;
            
            for(int j = index; j < m; j++){
                if(nums1[i] < nums2[j]){
                    nextGreater = nums2[j];
                    break;
                }
            }

            ans[indx] = nextGreater;
            indx++;
        }
        
        return ans;
    }
}