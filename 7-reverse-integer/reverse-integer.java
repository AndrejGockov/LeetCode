class Solution {
    public int reverse(int x) {
        long ans = 0;
        int dummy = Math.abs(x);

        while(dummy > 0){
            ans = (ans * 10) + dummy % 10;
            dummy /= 10;
            System.out.println(ans);
        }

        if(x < 0)
            ans *= (-1);

        if(ans > Math.pow(2, 31) || ans < -Math.pow(2,31))
            return 0;

        return (int)ans;
    }
}