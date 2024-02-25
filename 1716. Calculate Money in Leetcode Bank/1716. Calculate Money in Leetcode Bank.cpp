class Solution {
public:
    int totalMoney(int n) {
        int sum = 0;
        int dayOfWeek = 1;
        int weeklyAmmount = 0;
        for(int i = 0; i < n; i++){
            if(dayOfWeek > 7){
                dayOfWeek = 1;
                weeklyAmmount++;
            }

            sum += dayOfWeek + weeklyAmmount;
            dayOfWeek++;
        }

        return sum;
    }
};