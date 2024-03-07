class Solution {
public:
    int addDigits(int num){
        if(num < 10)
            return num;
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            num /= 10;
            ans += rem;
        }
        return addDigits(ans);
    }
};