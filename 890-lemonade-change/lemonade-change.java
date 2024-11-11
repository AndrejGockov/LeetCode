class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;

        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5)
                fives++;
            
            if(bills[i] == 10){
                if(fives < 0)
                    return false;
                
                fives--;
                tens ++;
            }

            if(bills[i] == 20){
                if(fives == 0 && tens == 0)
                    return false;
                
                if(tens == 0){
                    fives -= 3;
                }else{
                    tens--;
                    fives--;
                }
            }

            if(fives < 0 || tens < 0)
                return false;
        }

        return true;
    }
}