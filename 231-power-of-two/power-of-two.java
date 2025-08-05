class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0)
            return false;
        
        if(n == 1 || n == 2)
            return true;
        
        int i = 0;
        double power = 0;

        while(i < n){
            power = Math.pow(2, i);
            
            if(power > n)
                return false;

            if(power == n)
                return true;
            
            i++;
        }

        return false;
    }
}