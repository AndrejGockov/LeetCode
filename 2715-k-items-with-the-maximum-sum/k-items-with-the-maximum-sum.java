class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k == 0)
            return 0;
        
        int ans = 0;
        
        for(int i = 0; i < numOnes; i++){
            ans += 1;
            k--;
            if(k == 0)
                return ans;
        }

        for(int i = 0; i < numZeros; i++){
            k--;
            if(k == 0)
                return ans;
        }

        for(int i = 0; i < numNegOnes; i++){
            ans -= 1;
            k--;
            if(k == 0)
                return ans;
        }

        return ans;
    }
}