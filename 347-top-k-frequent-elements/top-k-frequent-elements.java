class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        int n = nums.length;
        Map<Integer, Integer>table = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            if(table.containsKey(nums[i])){
                table.put(nums[i], table.get(nums[i]) + 1);
            }else{
                table.put(nums[i], 1);
            }
        }

        int i = 0;
        System.out.println(table);

        while(i < k && !table.isEmpty()){
            int currKey = 0;
            int maxOccurances = 0;

            for(Map.Entry<Integer, Integer> item : table.entrySet()){

                System.out.println(item);
                
                if(maxOccurances < item.getValue()){
                    // maxOccurances = Math.max(maxOccurances, item.value());
                    currKey = item.getKey();
                    maxOccurances = item.getValue();
                }
            }
            
            table.remove(currKey, maxOccurances);
            ans[i] = currKey;
            i++;
        }
        System.out.println(table);
        return ans;
    }
}