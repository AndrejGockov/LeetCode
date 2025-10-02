class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int remainingBottles = 0;
        while(numBottles >= numExchange){
            remainingBottles = numBottles % numExchange;
            numBottles /= numExchange;
            ans += numBottles;
            numBottles += remainingBottles;
        }
        return ans;
    }
}