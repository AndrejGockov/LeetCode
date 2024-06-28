class Solution {
public:
    bool judgeSquareSum(int c){
        if(c == 0)
            return true;
        long long a = 0;
        long long b = sqrt(c);
        for(int i = 0; i < sqrt(c); i++){
            if((a * a) + (b * b) == c)
                return true;
            else if((a * a) + (b * b) > c){
                b--;
            }else{
                a++;
            }
        }
        return false;
    }
};