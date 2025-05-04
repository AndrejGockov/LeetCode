class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int ans = 0;
        int n = dominoes.length;
        Map<String, Integer>hash = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(dominoes[i][0] > dominoes[i][1]){
                int tmp = dominoes[i][0];
                dominoes[i][0] = dominoes[i][1];
                dominoes[i][1] = tmp;
            }
            
            String curr = dominoes[i][0] + "." + dominoes[i][1];
            
            hash.put(curr, hash.getOrDefault(curr, 0) + 1);
        }

        for(int i : hash.values()){
            ans += i * (i - 1) / 2;
        }

        return ans;
    }
}