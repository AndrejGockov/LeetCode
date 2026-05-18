public class Solution {
    public int Reverse(int x) {
        bool isNegative = x < 0;

        if(isNegative)
            x *= (-1);
        
        long ans = 0;

        while(x > 0){
            int rem = x % 10;
            x /= 10;
            ans = (ans * 10) + rem;
        }

        if(isNegative)
            ans *= (-1);
        
        if(ans > int.MaxValue || ans < int.MinValue)
            return 0;
        
        return (int)ans;
    }
}