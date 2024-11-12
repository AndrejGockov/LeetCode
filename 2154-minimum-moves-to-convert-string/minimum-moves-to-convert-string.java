class Solution {
    public int minimumMoves(String s) {
        int ans = 0;

        for(int i = 0; i < s.toCharArray().length; i++){
            if(s.toCharArray()[i] == 'X'){
                i += 2;
                ans++;
            }
        }

        return ans;
    }
}