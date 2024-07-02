class Solution {
public:
    bool threeConsecutiveOdds(vector<int>& arr) {
        int consecutive = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr[i] % 2 == 1){
                consecutive++;
            }else{
                consecutive = 0;
            }
            if(consecutive == 3)
                return true;
        }
        return false;
    }
};