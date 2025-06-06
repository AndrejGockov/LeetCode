class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int ans = 0;
        Arrays.sort(costs);

        for(int i = 0; i < costs.length; i++){
            if(coins < costs[i])
                return ans;
            
            coins -= costs[i];
            ans++;
        }
        return ans;
    }
}