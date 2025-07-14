class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer>map = new HashMap<>();
        int maxCount = 0;
        int ans = -1;

        for(int i : nums){
            if(i % 2 == 0)
                map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer>set : map.entrySet()){
            if((set.getValue() > maxCount)){
                ans = set.getKey();
                maxCount = set.getValue();
            }else if(set.getValue() == maxCount && ans > set.getKey()){
                ans = set.getKey();
            }
        }

        return ans;
    }
}