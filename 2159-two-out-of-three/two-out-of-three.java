class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer>ans = new ArrayList<Integer>(nums1.length + nums2.length + nums3.length);

        HashSet<Integer> hash = new HashSet<>();
        HashSet<Integer> hashTwo = new HashSet<>();
        HashSet<Integer> hashThree = new HashSet<>();

        // Can't add anything yet, because it's only in 1 Array
        for(int i : nums1){
            if(!hash.contains(i)){
                hash.add(i);
            }
        }

        // Add to ans if the number isn't in ans and is in the first array
        for(int i : nums2){
            if(hash.contains(i) && !ans.contains(i)){
                ans.add(i);
            }else if(!hashTwo.contains(i)){
                hashTwo.add(i);
            }
        }

        // Add to ans if the number isn't in ans 
        // and is in either the first or second array
        for(int i : nums3){
            if((hash.contains(i) || hashTwo.contains(i))
            && !ans.contains(i)){
                ans.add(i);
            }else if(!ans.contains(i)){
                hashThree.add(i);
            }
        }

        return ans;
    }
}