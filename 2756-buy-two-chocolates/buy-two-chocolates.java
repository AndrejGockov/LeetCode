class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int cost = 0;
        for(int i = 0; i < 2; i++){
            cost += prices[i];

            if(cost > money)
                return money;
        }

        return money - cost;
    }
}