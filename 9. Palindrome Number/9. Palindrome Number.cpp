class Solution {
public:
    bool isPalindrome(int x) {
    if(x < 0)
        return false;
    
    long long xCopy = x;
    long long newNum = 0;

    while(xCopy > 0){
        int rem = xCopy % 10;
        newNum =  (newNum * 10) + rem;
        xCopy /= 10;
    }

    if(newNum == x)
        return true;

    return false;
    }
};