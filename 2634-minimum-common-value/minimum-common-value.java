class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer>hash = new HashSet<>();
        int ans = Integer.MAX_VALUE;
        for(int i : nums1){
            if(!hash.contains(i)){
                hash.add(i);
            }
        }

        for(int i : nums2){
            if(hash.contains(i)){
                ans = Math.min(ans, i);
            }
        }

        if(ans == Integer.MAX_VALUE)
            return -1;

        return ans;
    }
}