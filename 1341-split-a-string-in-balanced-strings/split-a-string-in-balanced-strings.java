class Solution {
    public int balancedStringSplit(String s) {
        int L = 0;
        int ans = 0;
        for(char i : s.toCharArray()){
            if(i == 'L')
                L++;
            else
                L--;

            if(L == 0)
                ans++;
        }
        return ans;
    }
}