public class Solution {
    public int MaximumCount(int[] nums) {
        int p = 0, n = 0;
        foreach(int i in nums){
            if(i>0)
                p++;
            else if(i<0)
                n++;
        }
        
        return Math.Max(p,n);
    }
}