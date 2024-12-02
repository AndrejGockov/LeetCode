class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] arrCopy = arr.clone();
        Arrays.sort(arrCopy);

        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        int rank = 1;

        for(int key : arrCopy){
            if(!hash.containsKey(key))
                hash.put(key, rank++);
        }

        int[] ans = new int[n];

        for(int i = 0; i < n; i++)
            ans[i] = hash.get(arr[i]);

        return ans;
    }
}