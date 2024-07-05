class Solution {
public:
    bool isSameAfterReversals(int num) {
        int cpy = num;
        int rev = 0;

        while(cpy > 0){
            rev = (rev * 10) + cpy % 10;
            cpy /= 10;
        }

        while(rev > 0){
            cpy = (cpy * 10) + rev % 10;
            rev /= 10;
        }

        return (cpy == num);
    }
};