public class Solution {
    public bool IsPalindrome(int x) {
    if(x < 0)
        return false;
    
    long xCopy = x;
    long newNum = 0;

    while(xCopy > 0){
        long rem = xCopy % 10;
        newNum =  (newNum * 10) + rem;
        xCopy /= 10;
    }

    if(newNum == x)
        return true;

    return false;
    }
}