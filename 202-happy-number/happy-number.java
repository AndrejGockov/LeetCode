class Solution {
    public int newN(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += (rem * rem);
            n /= 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {
        // if(n < 10 && n != 1)
        //     return false;

        HashSet<Integer> hash = new HashSet<>();
        
        while(true){
            if(n == 1)
                return true;

            if(hash.contains(n))
                return false;
            
            //System.out.println(n);
            hash.add(n);
            n = newN(n);
        }
    }
}