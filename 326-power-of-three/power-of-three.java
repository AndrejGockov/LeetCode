class Solution {
    public boolean isPowerOfThree(int n) {
        if(n < 1)
            return false;
        
        if(n == 1)
            return true;
        
        int i = 0;
        double power = 0;

        while(i < n){
            power = Math.pow(3, i);
            System.out.println(power);

            if(power > n)
                break;

            if(power == n)
                return true;
            
            i++;
        }

        return false;
    }
}