class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer>hash = new HashMap<>();

        for(int i : nums1){
            hash.put(i, hash.getOrDefault(i, 0) + 1);
        }
        
        List<Integer> li = new ArrayList<>();

        for(int i : nums2){
            if(hash.containsKey(i) && hash.get(i) > 0){
                li.add(i);
                hash.put(i, hash.get(i) - 1);
            }
        }
        
        System.out.println(li);
        int[] ans = new int[li.size()];
        int i = 0;
        for(int j : li){
            ans[i] = j;
            i++;
        }
        return ans;
    }
}