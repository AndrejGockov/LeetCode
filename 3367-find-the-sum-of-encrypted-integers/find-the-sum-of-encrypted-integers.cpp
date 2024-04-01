class Solution {
public:
    int sumOfEncryptedInt(vector<int>& nums) {
        int ans = 0;
        for(int i : nums)
            ans+=Encrypt(i);
        return ans;
    }

    int Encrypt(int number){
        int n = to_string(number).length();
        int max = 0, newNumber = 0;
        while(number > 0){
            int rem = number % 10;
            number /= 10;

            if(rem > max)
                max = rem;
        }

        for(int i = 0; i < n; i++)
            newNumber = (newNumber * 10) + max;
        return newNumber;
    }
};