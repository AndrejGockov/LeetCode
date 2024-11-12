class Solution {
    public int maxDistance(int[] colors) {
        int ans = 1;
        int n = colors.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(colors[j] != colors[n - i - 1]
                && ans < Math.abs(n - i - 1 - j)){
                   ans = Math.abs(n - i - 1 - j);
                }
            }
        }

        return ans;
    }
}