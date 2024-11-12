class Solution {
    public int minimumMoves(String s) {
        int ans = 0;

        for(int i = 0; i < s.toCharArray().length; i++){
            if(s.toCharArray()[i] == 'X'){
                // while(s.toCharArray()[i] == 'X' 
                // && i < s.toCharArray().length - 2){
                    i += 2;
                // }
                ans++;
            }
        }

        return ans;
    }
}