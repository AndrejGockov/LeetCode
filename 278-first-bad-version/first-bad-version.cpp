// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int i = 1;
        while(n > 0){
            if(!isBadVersion(n))
                return n+1;
            if(isBadVersion(i))
                return i;
            i++;
            n--;
        }
        return 1;
    }
};