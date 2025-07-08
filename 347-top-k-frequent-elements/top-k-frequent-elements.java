class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        int n = nums.length;
        Map<Integer, Integer>table = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            table.put(nums[i], table.getOrDefault(nums[i], 1) + 1);
        }

        int i = 0;

        while(i < k && !table.isEmpty()){
            int maxOccurancesKey = 0;
            int maxOccurancesValue = 0;

            for(Map.Entry<Integer, Integer> item : table.entrySet()){
                maxOccurancesKey = (maxOccurancesValue < item.getValue()) ? item.getKey() : maxOccurancesKey;
                // if(maxOccurancesValue < item.getValue()){
                maxOccurancesValue = Math.max(maxOccurancesValue, item.getValue());
                //     maxOccurancesKey = item.getKey();
                //     maxOccurancesValue = item.getValue();
                // }
            }
            
            System.out.println(table);
            table.remove(maxOccurancesKey, maxOccurancesValue);
            ans[i] = maxOccurancesKey;
            i++;
        }
        System.out.println(table);
        return ans;
    }
}