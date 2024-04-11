public class Solution {
    public int SubtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }
        return product - sum;
    }
}