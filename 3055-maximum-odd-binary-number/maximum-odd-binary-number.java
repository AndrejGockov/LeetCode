class Solution {
    public String maximumOddBinaryNumber(String s) {
        String zeroes = "", ones = "";
        boolean firstFound = false;

        for(char i : s.toCharArray()){
            if(i == '1' && !firstFound){
                zeroes += i;
                firstFound = true;
                continue;
            }
            
            if(i == '1'){
                ones += i;
                continue;
            }
            
            zeroes = i + zeroes;
        }
        return ones + zeroes;
    }
}