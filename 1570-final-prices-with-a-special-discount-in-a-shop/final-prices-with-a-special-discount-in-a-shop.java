class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i = 0; i < prices.length - 1; i++){
            // int discount = 0;
            int j = i + 1;
            while(j < prices.length){
                if(prices[i] >= prices[j]){
                    prices[i] -= prices[j];
                    break;
                }
                j++;
            }
        }
        return prices;
    }
}