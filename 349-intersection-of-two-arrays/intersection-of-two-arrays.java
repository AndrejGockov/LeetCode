class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>originals = new HashSet<>();
        for(int i : nums1){
            originals.add(i);
        }
        
        HashSet<Integer>copies = new HashSet<>();
        for(int i : nums2){
            if(originals.contains(i) && !copies.contains(i))
                copies.add(i);
        }
        
        int[] ans = new int[copies.size()];
        int i = 0;
        for(int j : copies){
            ans[i] = j;
            i++;
        }
        return ans;
    }
}